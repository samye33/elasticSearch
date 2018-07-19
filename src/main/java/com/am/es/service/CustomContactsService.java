package com.am.es.service;

import com.am.es.model.CustomContactsVo;

import java.util.List;
import java.util.Map;

public interface CustomContactsService {
    void saveCustomContactsList(List<Integer> customerList);

    void deleteCustomContacts(Integer id);

    List<CustomContactsVo> getCustomContactsList(Map<String, ?> map, Integer currentPage, Integer pageSize);
}
