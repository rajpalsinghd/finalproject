package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Assignment;
@Repository
public interface AssignmentRepository extends CrudRepository<Assignment, Integer> {

public Assignment findById(int id);
}