package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

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
//        Student student = new Student();
//        student.setId(1);
//        student.setName("Sundy");
//        student.setCity("Indore");
//        int result = studentDao.insert(student);
//        System.out.println("Row inserted.. "+result);


//        Student student = new Student();
//        student.setId(1);
//        student.setName("Deepak");
//        student.setCity("Dewas");
//
//        int result = studentDao.change(student);
//        System.out.println("rows affected.." + result);

//        int result = studentDao.delete(1);
//        System.out.println("Student deleted" + result);

//        Student student = studentDao.getStudent(222);
//        System.out.println(student);

        List<Student> students = studentDao.getAllStudents();
        for(Student s : students){
            System.out.println(s);
        }
    }
}
