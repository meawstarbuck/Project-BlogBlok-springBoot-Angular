package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id")
    private Long id;

    @NotNull(message = "UserName NotNull")
    @NotEmpty(message = "UserName NotEmpty")
    @Column(nullable = false,name = "userName",length = 255)
    private String userName;

    @NotNull(message = "Subject NotNull")
    @NotEmpty(message = "Subject NotEmpty")
    @Column(nullable = false,length = 255,name="subject")
    private String subject;

    @NotNull(message = "Email NotNull")
    @NotEmpty(message = "Email NotEmpty")
    @Column(nullable = false,length = 255,name="email")
    @Email
    private String email;

    @NotNull(message = "Description NotNull")
    @NotEmpty(message = "Description NotEmpty")
    @Column(nullable = false,length = 2000,name="description")
    private String description;

    @Column(name = "createDate",nullable = true)
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "E, dd MMM yyyy HH:mm:ss", timezone = "GMT+7")
    public Date getCreateDate() { return createDate; }

    @PrePersist
    public void setCreateDate() { this.createDate = new Date(); }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
