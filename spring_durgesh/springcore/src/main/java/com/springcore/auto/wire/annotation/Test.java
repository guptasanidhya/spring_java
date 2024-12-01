package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Bello World");
        //Using because destroy method is not present inside application context it is present in the abstract application context
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autoannotationconfig.xml");

         Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
    }
}