package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentDaoImpl studentDao = context.getBean("studentDao",StudentDaoImpl.class);
        Student student = new Student();
        student.setId(1);
        student.setName("Sundy");
        student.setCity("Indore");

        int result = studentDao.insert(student);
        System.out.println("Row inserted.. "+result);
    }
}
