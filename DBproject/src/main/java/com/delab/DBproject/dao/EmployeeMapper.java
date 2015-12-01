package com.delab.DBproject.dao;

import org.springframework.stereotype.Repository;

import com.delab.DBproject.Entity.Employee;

@Repository(value = "EmployeeMapper")
public interface EmployeeMapper {
    Employee select(String id);
    void insert(Employee employee);
}