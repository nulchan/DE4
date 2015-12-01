package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "employeeMapper")
public interface EmployeeMapper {
    List<EmployeeVo> select();

    EmployeeVo selectOne(int emp_no);
    EmployeeVo selectId(String id);
    EmployeeVo selectPassword(String password);
    void insert(EmployeeVo employeeVo);
    void update(EmployeeVo employeeVo);
    void delete(int emp_no);
}