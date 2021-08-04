package com.kky.service;

import com.kky.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

    @Autowired
    private BaseDao<T> baseDao;

    public void save() {
        baseDao.save();
    }
}
