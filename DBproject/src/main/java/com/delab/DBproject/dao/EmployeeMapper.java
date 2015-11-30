package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "employeeMapper")
public interface EmployeeMapper {
    List<EmployeeVo> select();

    BbsVo selectOne(int emp_no);
    void insert(EmployeeVo employeeVo);
    void update(EmployeeVo employeeVo);
    void delete(int emp_no);
}