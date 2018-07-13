package com.am.es.dao;

import com.am.es.entity.SysUsers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysUsersMapper {

    SysUsers selectByPrimaryKey(Integer userId);

    List<SysUsers> selectAll();
}