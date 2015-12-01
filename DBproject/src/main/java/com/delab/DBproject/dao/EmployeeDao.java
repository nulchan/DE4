package com.delab.DBproject.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "employeeDao")
public class EmployeeDao {
    @Resource(name = "employeeMapper")
    private EmployeeMapper employeeMapper;

    public EmployeeVo getSelectId(String id) {
    	return this.employeeMapper.selectId(id);
    }
    
    public EmployeeVo getSelectPassword(String password) {
    	return this.employeeMapper.selectId(password);
    }
    
    public List<EmployeeVo> getSelect() {
        return this.employeeMapper.select();
    }

    public EmployeeVo getSelectOne(int emp_no) {
        return this.employeeMapper.selectOne(emp_no);
    }

    public void insert(EmployeeVo employeeVo) {
         this.employeeMapper.insert(employeeVo);
    }

    public void update(EmployeeVo employeeVo) {
         this.employeeMapper.update(employeeVo);
    }

    public void delete(int emp_no) {
         this.employeeMapper.delete(emp_no);
    }
}
