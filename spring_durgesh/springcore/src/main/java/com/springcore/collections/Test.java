package com.springcore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args) {
        System.out.println("Bello World");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/collectionsconfig.xml");
        Emp employee1= (Emp)context.getBean("emp1");
        System.out.println(employee1);
    }
}
