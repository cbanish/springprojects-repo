package com.demo.springboot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot.model.Employee;
 

 
@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {
 
}
