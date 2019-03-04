package com.demo.test;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringApplicationContext {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");
        List<User> list=userService.selectAll();
        for (User user : list){
            System.out.println("user : "+user);
        }

    }
}
