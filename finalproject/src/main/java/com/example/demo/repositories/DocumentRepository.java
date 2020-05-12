package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Document;
@Repository
public interface DocumentRepository extends CrudRepository<Document, Integer>{

	public Document findById(int id);

	public Document findByName(String name);
}
