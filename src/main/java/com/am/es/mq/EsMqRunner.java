package com.am.es.mq;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.openservices.ons.api.*;
import com.am.es.service.ClueQueryService;
import com.am.es.service.ClueTurnRecordService;
import com.am.es.service.GetClueIdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @Author: sam
 * @Date: 2018/7/16 13:54
 * @Description:
 */
@Component
public class EsMqRunner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(EsMqRunner.class);

    @Autowired
    private ClueQueryService clueQueryService;

    @Autowired
    private GetClueIdService getClueIdService;

    @Autowired
    private ClueTurnRecordService clueTurnRecordService;

    @Override
    public void run(String... args) throws Exception {
//        LOGGER.info("mq starting ..");
        //订阅线索新增消息
//        addMq();
    }

    public void addMq() {
        Properties properties = new Properties();
        // 您在控制台创建的 Consumer ID
        properties.put(PropertyKeyConst.ConsumerId, MqConstants.ES_CONSUMER_ID);
        // AccessKey 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.AccessKey, MqConstants.ALI_MQ_ACCESSKEY);
        // SecretKey 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.SecretKey, MqConstants.ALI_MQ_SECRETKEY);
        // 设置 TCP 接入域名（此处以公共云生产环境为例）
        properties.put(PropertyKeyConst.ONSAddr,
                MqConstants.ALI_MQ_ONS_ADDR);
        // 集群订阅方式 (默认)
        // properties.put(PropertyKeyConst.MessageModel, PropertyValueConst.CLUSTERING);
        // 广播订阅方式
        // properties.put(PropertyKeyConst.MessageModel, PropertyValueConst.BROADCASTING);
        Consumer consumer = ONSFactory.createConsumer(properties);
        //订阅
        consumer.subscribe(MqConstants.ARM_CRM_ES, "*", new MessageListener() { //订阅全部 Tag
            @Override
            public Action consume(Message message, ConsumeContext context) {

                byte[] body = message.getBody();
                Charset charset = Charset.defaultCharset();
                ByteBuffer buf = ByteBuffer.wrap(body);
                CharBuffer cBuf = charset.decode(buf);
                String ret = cBuf.toString();
                System.out.println("returning json is:" + ret);
                distinguishDB(ret);
                return Action.CommitMessage;
            }
        });
        consumer.start();
    }

    private void distinguishDB(String returnBody) {
        JSONObject json = JSONObject.parseObject(returnBody);
        int id = Integer.parseInt(json.getString("id"));
        List<Integer> list = new ArrayList<Integer>();
        list.add(id);
        String type = json.getString("type").replace(" ", "");
        String form = json.getString("form").replace(" ", "");
        switch (form) {
            case "ClueInfoMapper":
                if ("save".equals(type)) {
                    clueQueryService.saveClueQuery(id);
                } else if ("delete".equals(type)) {
                    clueQueryService.deleteClueQuery(id);
                }
                break;
            case "ClueTurnRecordMapper":
                if ("save".equals(type)) {
                    clueTurnRecordService.saveClueTurnRecordList(list);
                } else if ("delete".equals(type)) {
                    clueTurnRecordService.deleteClueTurnRecord(id);
                }
                break;

            case "CustomInfoMapper":
                id = getClueIdService.getClueIdBycustomerId(id);
                if ("save".equals(type)) {
                    clueQueryService.saveClueQuery(id);
                } else if ("delete".equals(type)) {
                    clueQueryService.deleteClueQuery(id);
                }
                break;
            case "ClueDescribeMapper":
                Integer clueId = getClueIdService.getClueIdByClueDescribeId(id);
                if ("save".equals(type)) {
                    clueQueryService.saveClueQuery(clueId);
                } else if ("delete".equals(type)) {
                    clueQueryService.deleteClueQuery(clueId);
                }
                break;
            case "ClueStatusMapper":
                id = getClueIdService.getClueIdByClueStatusId(id);
                if ("save".equals(type)) {
                    clueQueryService.saveClueQuery(id);
                } else if ("delete".equals(type)) {
                    clueQueryService.deleteClueQuery(id);
                }
                break;

        }
    }

}
