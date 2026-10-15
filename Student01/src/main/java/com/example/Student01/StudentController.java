package com.example.Student01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String gethelloworld() {
        return "Student Application is Working!";
    }
}
