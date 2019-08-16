package com.example.demo.controller;

import com.example.demo.dto.ListDTO;
import com.example.demo.exception.Response;
import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@Validated
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    private ModelMapper modelMapper = new ModelMapper();

    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/subjects")
    public List<ListDTO> getAllSubject(ListDTO listDTO){
        List<Subject> subjects = subjectService.getSubjects(listDTO);
        return  subjects.stream().map(subject -> convertToDto(subject)).collect(Collectors.toList());
    }

    private ListDTO convertToDto(Subject subject){
        ListDTO listDTO = modelMapper.map(subject, ListDTO.class);

        return listDTO;

    }

    @GetMapping("/subjects/{id}")
    public Optional<Subject>getSubjectById(@PathVariable long id) {
        return subjectService.getSubjectById(id);
    }


    @GetMapping("/getSubjectByUserName/{userName}")
    	public List<Subject> getSubjectByUser(@PathVariable String userName) {
    		return subjectService.getSubjectByUserName(userName);
    	}

    @GetMapping("/getSubjectBySubject/{subject}")
    public List<Subject> getSubjectBySubject(@PathVariable String subject) {
        return subjectService.getSubjectBySubject(subject);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/subjects/create")
    public Response create(@Valid @RequestBody Subject subject) {
        return subjectService.create(subject);
    }

}


