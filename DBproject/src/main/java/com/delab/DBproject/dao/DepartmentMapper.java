package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "departmentMapper")
public interface DepartmentMapper {
    List<DepartmentVo> select();

    DepartmentVo selectOne(String dept_name);
    void insert(DepartmentVo departmentVo);
    void update(DepartmentVo departmentVo);
    void delete(String dept_name);
}