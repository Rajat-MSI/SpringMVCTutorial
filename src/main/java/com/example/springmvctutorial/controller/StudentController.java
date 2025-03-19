package com.example.springmvctutorial.controller;

import com.example.springmvctutorial.model.Student;
import com.example.springmvctutorial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController
{
    //POST - Create
    //PUT - Update
    //GET - Get
    //PATCH - Authorize
    //mapping of url - we are mapping a function with a request every function in controller should be public

//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    web app is not deployed so it will run on localhost and the default port will be 8080
    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/welcome")
    public String welcome()
    {
        return "welcome";
    }

    @PostMapping("/form")
    public String form(@ModelAttribute("student") Student student)
    {
        System.out.println(student);
        studentService.add(student);
        return "welcome";
    }
// model attribute takes the input value from the form and save it into the class attributes
//    We will submit form on welcome.html and then request will be send to /form url as mentioned in the html code and after the function will run we will be redirected to welcome.html

    //form submission in MVC
}
