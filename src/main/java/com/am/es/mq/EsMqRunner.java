package com.am.es.mq;

import com.aliyun.openservices.ons.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.Properties;

/**
 * @Auther: fishf
 * @Date: 2018/7/16 13:54
 * @Description:
 */
@Configuration
public class EsMqRunner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(EsMqRunner.class);


//    @Autowired
//    private BaseMainServerMapper baseMainServerMapper;

    @Override
    public void run(String... args) throws Exception {

        //订阅线索新增消息
        addMq();
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

                System.out.println("接受到消息: " + message);


                return Action.CommitMessage;
            }
        });
        consumer.start();
        System.out.println("clueAddMq Consumer Started");
    }

    private String getLocalHostIp() {

        String ip = "";
        try {
            InetAddress address = InetAddress.getLocalHost();
            ip = address.getHostAddress();
        } catch (Exception e) {
            LOGGER.error("get local server ip error:" + e.getMessage());
        }

        return ip;
    }

  /*  private boolean isMainServer()
    {


        boolean isMainServer = false;

        String localIp = getLocalHostIp();

        BaseMainServer mainServer = baseMainServerMapper.getOneMainServer();

        if (mainServer != null)
        {

            if (StringUtils.isNotBlank(localIp))
            {

                String mainServerIp = mainServer.getIp();
                if (mainServerIp.equals(localIp))
                {
                    isMainServer = true;
                }
            }
        }
        return isMainServer;
    }*/
}
