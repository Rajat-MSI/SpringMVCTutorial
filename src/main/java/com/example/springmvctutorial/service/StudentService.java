package com.example.springmvctutorial.service;

import com.example.springmvctutorial.dao.StudentDao;
import com.example.springmvctutorial.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    @Autowired
    private StudentDao studentDao;

    public void add(Student student)
    {
        studentDao.save(student);
        //here we will call dao class for student to persist data in db and for getting updating deleting also
    }
}
