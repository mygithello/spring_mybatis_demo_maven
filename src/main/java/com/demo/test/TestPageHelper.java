package com.demo.test;

import com.demo.entity.MybatisDateMapping;
import com.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.jdi.PathSearchingVirtualMachine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestPageHelper {
    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");

        MybatisDateMapping mybatisDateMapping1=new MybatisDateMapping("张三","123",new Date());
        userService.insertMybatisDateMapping(mybatisDateMapping1);

        int num=6;
        int size=5;
        // pageHelper分页查询对象
        PageHelper.startPage(num, size);

        List<MybatisDateMapping> list=userService.selectMybatisDateMapping();

        PageInfo<MybatisDateMapping> pagehelper = new PageInfo<MybatisDateMapping>(list);

        for (MybatisDateMapping mybatisDateMapping : list){
            System.out.println("MybatisDateMapping : "+mybatisDateMapping);
        }

    }
}
