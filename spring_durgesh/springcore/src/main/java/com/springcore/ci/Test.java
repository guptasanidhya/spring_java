package com.springcore.ci;
import com.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Bello World");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/ciconfig.xml");
        Person person1= (Person)context.getBean("person");
        System.out.println(person1);

        Addition add1= (Addition) context.getBean("addition1");
       add1.doSum();
        Addition add2= (Addition) context.getBean("addition2");
        add2.doSum();
    }
}
