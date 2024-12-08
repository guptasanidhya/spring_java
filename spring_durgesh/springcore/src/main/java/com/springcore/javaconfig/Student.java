package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    //    @Autowired
    private Samosa samosa;

    public void getStudy(){
        System.out.println("I am Studying Hard");
        samosa.display();
    }
}
