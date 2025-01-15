package org.example.demo2.controller;

import org.example.demo2.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person getPerson() {
        return person;
    }
    @RequestMapping("/hello")
    public String run()
    {
        System.out.println(person);
        return "This is SpringBoot2 Demo2!";
    }
}
