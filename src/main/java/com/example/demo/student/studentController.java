package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/abc/student")

public class studentController {

    private final studentService studentService;
    @Autowired
    public studentController(studentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()

    public List<Student> getStudent() {
        return studentService.getStudent();

    }

    @PostMapping
    public void RegisterNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }
}