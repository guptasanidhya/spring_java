package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Teacher teacher1 = context.getBean("teacher",Teacher.class);
        System.out.println(teacher1.hashCode());
        Teacher teacher2 = context.getBean("teacher",Teacher.class);
        System.out.println(teacher2.hashCode());

    }
}
