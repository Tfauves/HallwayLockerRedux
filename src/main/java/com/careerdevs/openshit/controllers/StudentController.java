package com.careerdevs.openshit.controllers;

import com.careerdevs.openshit.models.Student;
import com.careerdevs.openshit.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

    @PutMapping("/{id}")
    public @ResponseBody Student updateStudent(@PathVariable Long id, @RequestBody Student updateData) {
        Student student = repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (updateData.getFirstName() != null) student.setFirstName(updateData.getFirstName());
        if (updateData.getLastName() != null) student.setLastName(updateData.getLastName());
        if (updateData.getCohort() != null) student.setCohort(updateData.getCohort());

        return repository.save(student);

    }






}
