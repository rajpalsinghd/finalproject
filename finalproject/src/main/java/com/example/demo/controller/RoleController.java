package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RoleService;
import com.example.demo.domain.*;
@RestController
@RequestMapping("api/role")
public class RoleController {

	
	@Autowired
	private RoleService roleService;

@PostMapping("")
public ResponseEntity<?> createRole(@Valid @RequestBody Role role,BindingResult bindingResult)
{
	role=roleService.save(role);
	return new ResponseEntity<Role>(role,HttpStatus.CREATED);
}
}
