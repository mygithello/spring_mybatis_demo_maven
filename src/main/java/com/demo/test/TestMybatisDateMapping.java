package com.demo.test;


import com.demo.entity.MybatisDateMapping;
import com.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
public class TestMybatisDateMapping {

    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");

        MybatisDateMapping mybatisDateMapping1=new MybatisDateMapping("张三","123",new Date());
        userService.insertMybatisDateMapping(mybatisDateMapping1);

        List<MybatisDateMapping> list=userService.selectMybatisDateMapping();
        for (MybatisDateMapping mybatisDateMapping : list){
            System.out.println("MybatisDateMapping : "+mybatisDateMapping);
        }

    }
}
