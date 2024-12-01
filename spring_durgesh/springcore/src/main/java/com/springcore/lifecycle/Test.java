package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Bello World");
        //Using because destroy method is not present inside application context it is present in the abstract application context
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("/lifecycleconfig.xml");

        Samosa s1 = (Samosa) context.getBean("s1");
        System.out.println(s1);
        //for destroying object
        context.registerShutdownHook();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Pepsi p1 = (Pepsi) context.getBean("p1");
        System.out.println(p1);

    }
}
