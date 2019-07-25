package com.user.service;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 查询用户列表
     * */
    List<Map> getList();

    /**
     * 根据id查询用户
     * */
    Map getById(int id);
}
