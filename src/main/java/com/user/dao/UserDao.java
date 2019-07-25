package com.user.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDao {

    /**
     * 查询用户列表
     * */
    @Select("select * from user")
    List<Map> getList();

    /**
     * 根据id查询用户
     * */
    @Select("select * from user where id =#{id}")
    List<Map> getById(int id);
}
