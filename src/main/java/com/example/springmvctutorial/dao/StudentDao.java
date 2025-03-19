package com.example.springmvctutorial.dao;

import com.example.springmvctutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student,String>
{
    //we are using JPA to persist data
    // this interface provides us methods that can be directly used in service to save the data in db
    //JPARepository is the main class responsible to CRUD operations means this will provide us the inbuilt JDBC functions
}
