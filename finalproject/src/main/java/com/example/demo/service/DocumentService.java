package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Document;
import com.example.demo.repositories.DocumentRepository;

@Service
public class DocumentService {

	@Autowired
	private DocumentRepository documentRepository;
	
	public void createDocument(Document document)
	{
		document.setName(document.getName().toUpperCase());
	documentRepository.save(document);	
	}
    public Document getDocument(int id)
    {
    	return documentRepository.findById(id);
    }
	public Document searchByName(String name) {
	System.out.println(name);
		return documentRepository.findByName(name.toUpperCase());	
	}
	
}
