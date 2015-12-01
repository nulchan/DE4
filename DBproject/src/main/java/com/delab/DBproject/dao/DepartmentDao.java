package com.delab.DBproject.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "departmentDao")
public class DepartmentDao {
    @Resource(name = "departmentMapper")
    private DepartmentMapper departmentMapper;

    public List<DepartmentVo> getSelect() {
        return this.departmentMapper.select();
    }

    public void insert(DepartmentVo departmentVo) {
         this.departmentMapper.insert(departmentVo);
    }

    public void update(DepartmentVo departmentVo) {
         this.departmentMapper.update(departmentVo);
    }

    public void delete(String department_name) {
         this.departmentMapper.delete(department_name);
    }
}
