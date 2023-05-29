package com.dipan.springPrac.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")

public class StuController {
    private StudentService service;
    public StuController(StudentService service) {
        this.service = service;
    }
    @GetMapping
    public List<Student> findStudents(){
        return service.findStudents();
    }
}

