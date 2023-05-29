package com.dipan.springPrac.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findStudents(){
        return List.of(
                new Student("Name","New",
                        LocalDate.now(),
                        "contact@gg.com",22),
                new Student("Gggg","Name",
                        LocalDate.now(),
                        "contact@gg.com",22)
        );
    }
}
