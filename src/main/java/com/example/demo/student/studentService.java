package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class studentService {

    private final studentRepo Repo;

    public studentService(studentRepo repo) {
        Repo = repo;
    }

    public List<Student> getStudent() {

        return Repo.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println("Student added");
    }
}


