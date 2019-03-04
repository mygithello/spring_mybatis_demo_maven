package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.MybatisDateMapping;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll() {
       List<User> list= userDao.selectAll();
        return list;
    }

    @Override
    public int insertMybatisDateMapping(MybatisDateMapping mybatisDateMapping) {
        int i=userDao.insertMybatisDateMapping(mybatisDateMapping);
        return i;
    }

    @Override
    public int updateMybatisDateMapping(MybatisDateMapping mybatisDateMapping) {
        int i=userDao.updateMybatisDateMapping(mybatisDateMapping);
        return i;
    }

    @Override
    public List<MybatisDateMapping> selectMybatisDateMapping() {
        return userDao.selectMybatisDateMapping();
    }

}
