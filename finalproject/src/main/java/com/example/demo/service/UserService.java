package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.*;
import com.example.demo.repositories.TraineeRepository;
@Service
public class UserService {

	@Autowired
private TraineeRepository traineeRepository;
	
	public void blockUser(User user)
	{
	Role role=user.getRole();
	if(role.getName().equalsIgnoreCase("Trainee"))
	{
		Trainee trainee=traineeRepository.findById(user.getId());
		trainee.setBlock(true);
		traineeRepository.deleteById(user.getId());
		traineeRepository.save(trainee);
	}
		
	}public void deleteUser(User user)
	{
		Role role=user.getRole();
	    if(role.getName().equalsIgnoreCase("Trainee"))
	    {
	    	traineeRepository.deleteById(user.getId());
	    }
		
	}
	public void changeUserRole(@Valid User user) {
		
		Role role=user.getRole();
	    if(role.getName().equalsIgnoreCase("Trainee"))
	    {
	    	traineeRepository.deleteById(user.getId());
	        //will create object of Trainer class
	    }
		
		
		
	}
	
	
}
