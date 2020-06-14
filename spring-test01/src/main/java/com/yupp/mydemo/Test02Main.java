package com.yupp.mydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02Main {
    public static void main(String[] args) {
        //创建Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取id为Person调用的bean
        Person p = context.getBean("chinese", Person.class);
        //调用useAxe();
        p.useAxe();

    }
}
