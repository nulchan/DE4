package com.delab.DBproject.dao;

import org.springframework.stereotype.Repository;

import com.delab.DBproject.Entity.Employee;

@Repository(value = "LoginMapper")
public interface LoginMapper {
    Employee select(String id);
}