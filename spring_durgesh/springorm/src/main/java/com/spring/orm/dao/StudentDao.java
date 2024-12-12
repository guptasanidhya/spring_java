package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
public class StudentDao {

    private SessionFactory sessionFactory;

    // Constructor-based injection (optional, you can also use setters)
    public StudentDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public StudentDao() {
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Insert method using Session API
    @Transactional
    public void insert(Student student) {
        Session session = sessionFactory.getCurrentSession();
        //save method depricated in 6.0
         session.persist(student);
        System.out.println("A new row Added");
    }

    @Transactional
    public Student getSingleStudent(int  studentId){
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class,studentId);
    }

    @Transactional
    public List<Student>  getAllStudents(){
        Session session = sessionFactory.getCurrentSession();
        //loadALl method deprecated in 6.0
        return session.createQuery("from Student",Student.class).getResultList();
    }

    @Transactional
    public void deleteStudent(int studentId){
        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class,studentId);
        //delete method deprecated in 6.0
        if (student != null) {
            session.remove(student);
            System.out.println("Student deleted with ID: " + studentId);
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
    }

    @Transactional
    public void updateStudent(Student student){
        //update and updateorsave method deprecated in 6.0 use merge i guess or persist in combination
        Session session = sessionFactory.getCurrentSession();
        if (Objects.isNull(session.find(Student.class, student.getStudentId()))) {
            session.persist(student);
            System.out.println("new Added");
        } else {
            session.merge(student);
            System.out.println(("merged"));
        }
    }
}
