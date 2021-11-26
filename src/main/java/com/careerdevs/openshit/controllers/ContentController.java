package com.careerdevs.openshit.controllers;


import com.careerdevs.openshit.models.Content;
import com.careerdevs.openshit.repositories.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/content")
public class ContentController {
    @Autowired
    private ContentRepository repository;
}
