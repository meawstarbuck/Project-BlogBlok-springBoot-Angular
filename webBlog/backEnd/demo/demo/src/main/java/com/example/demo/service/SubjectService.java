package com.example.demo.service;

import com.example.demo.dto.ListDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.Response;
import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

//    public Subject create(Subject subject){ return subjectRepository.save(subject); }


    public Optional<Subject> getSubjectById(long id){ return subjectRepository.findById(id); }

    public List<Subject> getSubjectByUserName(String userName){
       return subjectRepository.findByUserName(userName);
    }

    public  List<Subject> getSubjectBySubject(String subject){
        return subjectRepository.findBySubject(subject);
    }

    public List<Subject> getSubjects(ListDTO listDTO) {

        if (subjectRepository.findAll().isEmpty()) {

            throw new ResourceNotFoundException(listDTO.getId());

        } else {

            return subjectRepository.findAll();
        }
    }

    public Response create(Subject subject) {

        if (subject.getId() == null) {
            subjectRepository.save(subject);
            return new Response(subject.getUserName());

        } else {

            subject.setId(null);
            subjectRepository.save(subject);
            return new Response(subject.getUserName());
        }
    }

}
