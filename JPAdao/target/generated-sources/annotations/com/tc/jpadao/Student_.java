package com.tc.jpadao;

import com.tc.jpadao.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-28T18:41:41")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile ListAttribute<Student, Student> student;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Integer> age;
    public static volatile SingularAttribute<Student, String> email;
    public static volatile SingularAttribute<Student, Integer> sid;

}