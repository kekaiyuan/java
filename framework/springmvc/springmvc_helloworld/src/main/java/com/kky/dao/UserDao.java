package com.kky.dao;

import com.kky.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @author 柯凯元
 * @date 2021/08/06 11:31
 */
@Repository
public class UserDao {

    public void insert(User user){
        System.out.println("insert");
        System.out.println("啊啊啊啊");
    }

    public void delete(Integer id){
        System.out.println("delete "+id);
    }

    public void update(Integer id){
        System.out.println("update "+id);
    }

    public void select(Integer id){
        System.out.println("select "+id);
    }

}
