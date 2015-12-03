package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "projectMapper")
public interface ProjectMapper {
    List<ProjectVo> select();

    ProjectVo selectOne(String dept_name);
    void insert(ProjectVo projectVo);
    void update(ProjectVo projectVo);
    void delete(String dept_name);
}