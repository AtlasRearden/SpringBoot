package com.dipan.springPrac.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoryStudent implements StudentService{

    private final MemoryStudentDao dao;

    public MemoryStudent(MemoryStudentDao dao) {
        this.dao = dao;
    }


    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public List<Student> findStudents() {
        return dao.findStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}
