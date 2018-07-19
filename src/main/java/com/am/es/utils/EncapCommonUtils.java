package com.am.es.utils;

import com.am.es.model.clue.ClueInfoVo;
import com.am.es.model.clue.CustomInfoVo;

import java.util.List;

public class EncapCommonUtils {
    public static List<CustomInfoVo> encapCustomInfo(List<CustomInfoVo> customInfoist, List<ClueInfoVo> clueInfoList) {
        for (int i = 0; i < customInfoist.size(); i++) {
            CustomInfoVo customInfoVo = customInfoist.get(i);
            for (int j = 0; j < clueInfoList.size(); j++) {
                if (customInfoVo.getId() == clueInfoList.get(j).getCustomId()) {
                    customInfoist.get(i).setClueInfoVo(clueInfoList.get(j));
                    break;
                }
            }
        }
        return customInfoist;
    }
}
