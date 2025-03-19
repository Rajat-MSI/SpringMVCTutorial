package com.example.springmvctutorial.model;

//all the attributes should be private
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@ToString
@Entity
public class Student
{
    //spring data jpa stands for java persistence api
    //this is built upon JDBC --- JDBC will be abstract layer for JPA
    //we will define the jdbc url and username pass for database in application.properties because it is spring boot configuration file

    @Id //this is use to define primary key
    @GeneratedValue(strategy = GenerationType.UUID) // this is use for generating id as like auto increment feature in db
    private String id;
    private String name;
    private int age;

    //parameterized AllArgsConstructor
//    public Student(int id,String name,String age)
//    {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//    Student student = new Student(id,name,age);

//    public Student()
//    {
//
//    }
//Student student = new Student();
}
