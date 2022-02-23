package com.kky.dao;

import com.kky.bean.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao extends BaseDao<Teacher>{
    @Override
    public void save() {
        System.out.println("保存老师");
    }
}
