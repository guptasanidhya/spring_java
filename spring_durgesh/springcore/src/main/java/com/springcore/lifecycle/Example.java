package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Example {

    private String subject;

    public Example(String subject) {
        this.subject = subject;
    }

    public Example() {
        super();
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @PostConstruct
    public void start(){
        System.out.println("Starting method using annotation");
    }

    @PreDestroy
    public void end(){
        System.out.println("End method using annotation");
    }
}


