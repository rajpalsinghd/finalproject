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

import com.example.demo.domain.Document;
import com.example.demo.service.DocumentService;

@RestController
@RequestMapping("api/document")

public class DocumentController {

	@Autowired
	private DocumentService documentService;

@PostMapping("")	
public void createDocument(@Valid @RequestBody Document document,BindingResult bindingResult)
{
	documentService.createDocument(document);
}

@GetMapping("/{id}")
public ResponseEntity<?>getDocument(@PathVariable int id)
{
	Document document=documentService.getDocument(id);
return new ResponseEntity<Document>(document, HttpStatus.OK);
}

@GetMapping("search/{name}")
public ResponseEntity<?>searchDocument(@PathVariable String name)
{
	System.out.println(name);
	Document document=documentService.searchByName(name);
	if (document!=null)
	{
		document.setContent("");
	}
	return new ResponseEntity<Document>(document, HttpStatus.OK);
}
}
