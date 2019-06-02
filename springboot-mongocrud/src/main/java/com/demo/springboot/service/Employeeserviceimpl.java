package com.demo.springboot.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.dao.Employeedao;
import com.demo.springboot.model.Employee;

@Service
public class Employeeserviceimpl {
 
    // The dao repository will use the Mongodb-Repository to perform the database operations.
    @Autowired
    Employeedao dao;
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#createEmployee(java.util.List)
     */
    
    public void createEmployee(List<Employee> emp) {
        dao.saveAll(emp);
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#getAllEmployees()
     */
    
    public Collection<Employee> getAllEmployees() {
        return dao.findAll();
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#findEmployeeById(int)
     */
    
    public Optional<Employee> findEmployeeById(int id) {
        return dao.findById(id);
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#deleteEmployeeById(int)
     */
   
    public void deleteEmployeeById(int id) {
        dao.deleteById(id);
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#updateEmployee(int)
     */
  
    public void updateEmployee(Employee emp) {
        dao.save(emp);
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#deleteAllEmployees()
     */
    
    public void deleteAllEmployees() {
        dao.deleteAll();
    }
}
