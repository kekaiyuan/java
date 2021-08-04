package com.kky.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

    public void save(){
        System.out.println("persondao");
    }

}
