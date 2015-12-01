package com.delab.DBproject.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.delab.DBproject.Entity.Employee;

@Service(value = "EmployeeDao")
public class EmployeeDao {
    @Resource(name = "EmployeeMapper")
    private EmployeeMapper EmployeeMapper;

    public Employee getSelect(String id){
    	return this.EmployeeMapper.select(id);
    }
}
