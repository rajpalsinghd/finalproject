package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.*;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

	
}
