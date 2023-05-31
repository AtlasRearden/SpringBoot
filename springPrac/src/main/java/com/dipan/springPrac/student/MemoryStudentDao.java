package com.dipan.springPrac.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class MemoryStudentDao {
    private final List<Student>lst=new ArrayList<>();


    public Student save(Student s) {
        lst.add(s);
        return s;
    }

    public List<Student> findStudents() {
        return lst;
    }

    public Student findByEmail(String email) {
        return lst.stream()
                .filter(s->email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Student update(Student s) {
        var studentIndex= IntStream.range(0,lst.size())
                .filter(index->lst.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex>-1){
            lst.set(studentIndex,s);
            return s;
        }
        return null;
    }

    public void delete(String email) {
        var student =findByEmail(email);
        if (student!=null){
            lst.remove(student);
        }

    }
}



//List.of(
//        new Student("Name","New",
//        LocalDate.now(),
//        "contact@gg.com",22),
//        new Student("Gggg","Name",
//        LocalDate.now(),
//        "contact@gg.com",22));