/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.jpaservice;

import com.tc.jpadao.Student;
import com.tc.jpadao.StudentPersistence;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"JPAdaoBeans.xml"});

        StudentPersistence sp = (StudentPersistence) context.getBean("Studentpu");

        Student student = new Student();
        student.setSid(1234);
        student.setName("Bob Jones");
        student.setAge(25);
        student.setEmail("bob.jones@gmail.com");

        try {

            sp.persist(student);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
