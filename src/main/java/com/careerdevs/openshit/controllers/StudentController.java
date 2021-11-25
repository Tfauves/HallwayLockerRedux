package com.careerdevs.openshit.controllers;

import com.careerdevs.openshit.models.Student;
import com.careerdevs.openshit.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public List<Student> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student newStudent) {
        return new ResponseEntity<>(repository.save(newStudent), HttpStatus.CREATED);
    }






}
