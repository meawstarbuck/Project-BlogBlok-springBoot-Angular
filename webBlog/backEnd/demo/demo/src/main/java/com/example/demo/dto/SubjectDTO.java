package com.example.demo.dto;

import org.springframework.validation.annotation.Validated;



@Validated
public class SubjectDTO {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}


