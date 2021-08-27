package com.kky.service;

import com.kky.bean.User;
import com.kky.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 柯凯元
 * @date 2021/08/06 11:50
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void insert(User user){
        userDao.insert(user);
    }

    public void delete(Integer id){
        userDao.delete(id);
    }

    public void update(Integer id){
        userDao.update(id);
    }

    public void select(Integer id){
        userDao.select(id);
    }

}
