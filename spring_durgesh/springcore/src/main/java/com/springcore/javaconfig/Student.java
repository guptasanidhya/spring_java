package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {

    @Autowired
    private Samosa samosa;

    public void getStudy(){
        System.out.println("I am Studying Hard");
        samosa.getSamosa();
    }
}
