package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Assignment;
import com.example.demo.service.AssignmentService;





@RestController
@RequestMapping("api/assignment")

public class AssignmentController {

	@Autowired
	private AssignmentService assignmentService;

@PostMapping("")	
public void createAssignment(@Valid @RequestBody Assignment assignment,BindingResult bindingResult)
{
	assignmentService.createAssignment(assignment);
}

@GetMapping("/{id}")
public ResponseEntity<?>getAssignment(@PathVariable int id)
{
	Assignment assignment=assignmentService.getAssignment(id);
return new ResponseEntity<Assignment>(assignment, HttpStatus.OK);
}
}
