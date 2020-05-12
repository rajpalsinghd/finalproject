package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Assignment;
import com.example.demo.repositories.AssignmentRepository;

@Service
public class AssignmentService {

@Autowired	
private AssignmentRepository assignmentRepository;

public void createAssignment(Assignment assignment)
{
	assignmentRepository.save(assignment);
}

public Assignment getAssignment(int id)
{
	return assignmentRepository.findById(id);
}
}