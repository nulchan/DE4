package com.delab.DBproject.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.delab.DBproject.Entity.Employee;

@Service(value = "LoginDao")
public class LoginDao {
    @Resource(name = "LoginMapper")
    private LoginMapper loginMapper;

    public Employee getSelect(String id){
    	return this.loginMapper.select(id);
    }
}
