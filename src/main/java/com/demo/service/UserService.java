package com.demo.service;

import com.demo.entity.MybatisDateMapping;
import com.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();


    int insertMybatisDateMapping(MybatisDateMapping mybatisDateMapping);
    int updateMybatisDateMapping(MybatisDateMapping mybatisDateMapping);
    List<MybatisDateMapping> selectMybatisDateMapping();
}
