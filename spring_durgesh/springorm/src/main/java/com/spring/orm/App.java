package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
//        Student student = new Student(12,"sandy gupta","Mandsaur" );
//        studentDao.insert(student);
//        Student student = studentDao.getSingleStudent(11);
//        System.out.println(student);
//
//
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        List<Student> students = studentDao.getAllStudents();
//            for(Student s : students){
//                System.out.println(s);
//            }

//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//            studentDao.deleteStudent(123);

//        Student student = new Student(12,"Malgudi","Indore" );
//        studentDao.updateStudent(student);

    }
}
