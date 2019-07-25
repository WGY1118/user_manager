package com.user.service;

import com.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: user_manager
 * @description:
 * @author: WGY
 * @create: 2019-07-23 09:11
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<Map> getList() {
        return userDao.getList();
    }

    @Override
    public Map getById(int id) {
        List<Map> userList = userDao.getById(id);
        if (userList!=null&&userList.size()>0){
            return userList.get(0);
        }
        return null;
    }
}
