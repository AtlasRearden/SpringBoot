package com.dipan.springPrac.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")

public class StuController {
    @GetMapping
    public List<String> findStudents(){
        return List.of(
            "hello",
            "good"
            );
    }
}

