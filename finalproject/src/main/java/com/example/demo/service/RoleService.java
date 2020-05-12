package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.*;
import com.example.demo.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	
	public Role save(Role role)
	{
		return roleRepository.save(role);
	}
	
	
	
}
