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

import com.example.demo.domain.Trainee;
import com.example.demo.service.TraineeService;

@RestController
@RequestMapping("api/trainee")
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	
	
	@PostMapping("")
	public ResponseEntity<?> createNewTrainee(@Valid @RequestBody Trainee trainee,BindingResult bindingResult)
	{
		System.out.println("Working");
		Trainee newTrainee=traineeService.saveTrainee(trainee);
         return new ResponseEntity<Trainee>(newTrainee, HttpStatus.CREATED);
	}
	
	@GetMapping("/{traineeId}")
	public ResponseEntity<?>getTraineeById(@PathVariable int traineeId)
	{
		Trainee trainee=traineeService.getTrainee(traineeId);
		return new ResponseEntity<Trainee>(trainee,HttpStatus.OK);
		
	}
		
	
	
}
