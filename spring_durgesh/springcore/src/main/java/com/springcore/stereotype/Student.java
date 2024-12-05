package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.*;
@Component
public class Student {

    @Value("Sanidhya")
    private String studentName;
    @Value("Indore")
    private String city;

   @Value("#{temp}")
    private List address;

    public List getAddress() {
        return address;
    }

    public void setAddress(List address) {
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
