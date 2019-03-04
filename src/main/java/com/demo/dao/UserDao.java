package com.demo.dao;

import com.demo.entity.MybatisDateMapping;
import com.demo.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();


    int insertMybatisDateMapping(MybatisDateMapping mybatisDateMapping);
    int updateMybatisDateMapping(MybatisDateMapping mybatisDateMapping);
    List<MybatisDateMapping> selectMybatisDateMapping();
}
