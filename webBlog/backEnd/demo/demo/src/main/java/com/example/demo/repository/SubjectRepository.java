package com.example.demo.repository;

import com.example.demo.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {
    List<Subject> findAll();

    List<Subject> findBySubject(String subject);

    List<Subject> findByUserName(String userName);






}
