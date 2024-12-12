package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean input = true;
        while(input){
            System.out.println("Press 1 for adding new student");
            System.out.println("Press 2 for displaying all students");
            System.out.println("Press 3 for getting detail of single student");
            System.out.println("Press 4 for deleting a student");
            System.out.println("Press 5 for updating student");
            System.out.println("Press 6 for exit");

            try{

                int value = Integer.parseInt(br.readLine());
                switch (value){
                    case 1:
                        //adding a student
                        System.out.println("Enter user Id : ");
                        int uId = Integer.parseInt(br.readLine());
                        System.out.println("Enter user Name : ");
                        String uName = br.readLine();
                        System.out.println("Enter user City : ");
                        String uCity = br.readLine();

                        Student s = new Student(uId,uName,uCity);
                        studentDao.insert(s);
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                        break;
                    case 2:
                        //Displaying all students
                        List<Student> studentList = studentDao.getAllStudents();
                        for(Student st: studentList){
                            System.out.println(st.getStudentId()+" "+st.getStudentName()+" "+st.getStudentCity());
                            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println();

                        }
                        break;
                    case 3:
                        //displaying single student
                        System.out.println("Enter the student Id :");
                        int displayId = Integer.parseInt(br.readLine());
                        Student stu = studentDao.getSingleStudent(displayId);
                        System.out.println(stu.getStudentId()+" "+ stu.getStudentName()+ " "+stu.getStudentCity());
                        System.out.println("+++++++++++++++++++++++++++++++++++");
                        break;
                    case 4:

                        System.out.println("Enter the student Id you want to delete : ");
                        int deleteId= Integer.parseInt(br.readLine());
                        studentDao.deleteStudent(deleteId);
                        System.out.println("++++++++++++++++++++++++++++++++++++++");
                        break;
                    case 5:
                        System.out.println("Enter the student details to update : ");
                        Student stud = new Student();
                        System.out.println("Enter the student old Id : ");
                        int updateId = Integer.parseInt(br.readLine());
                        stud.setStudentId(updateId);
                        System.out.println("Enter the new student name :");
                        String updateName = br.readLine();
                        stud.setStudentName(updateName);
                        System.out.println("Enter the new student city :");
                        String updateCity = br.readLine();
                        stud.setStudentCity(updateCity);

                        studentDao.updateStudent(stud);
                        System.out.println("++++++++++++++++++++++++++++");


                        break;
                    case 6:
                        input=false;
                        break;
                }

            }catch(Exception e){
                System.out.println("Try valid option");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thank you for your Service");
    }
}
