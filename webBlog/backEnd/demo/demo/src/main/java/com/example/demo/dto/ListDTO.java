package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.PrePersist;
import java.util.Date;

public class ListDTO {

    private Long id;

    private String userName;

    private String subject;

    private String email;

    private String description;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
    public Date getCreateDate() {
        return createDate;
    }

    @PrePersist
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
