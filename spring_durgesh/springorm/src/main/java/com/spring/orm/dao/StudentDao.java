package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
    public int insert(Student student) {
        Session session = sessionFactory.getCurrentSession();
        Integer i = (Integer) session.save(student);
//        return (Integer) session.save(student);
        return i;
    }
}
