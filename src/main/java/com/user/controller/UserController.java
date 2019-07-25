package com.user.controller;

import com.user.service.EmpService;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: user_manager
 * @description:
 * @author: WGY
 * @create: 2019-07-23 09:14
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmpService empService;

    /**
     * 用户列表
     * */
    @RequestMapping("userList")
    public Object list(){
        System.out.println("111");
        return userService.getList();
    }

    /**
     * 根据id获取对象
     * */
    @RequestMapping("userById")
    public Object getUser(Integer id){
        Map user = userService.getById(id);
        user.put("empList",empService.getEmpList());
        return user;

    }
}
