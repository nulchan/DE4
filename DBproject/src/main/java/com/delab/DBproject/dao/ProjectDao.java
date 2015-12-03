package com.delab.DBproject.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "projectDao")
public class ProjectDao {
    @Resource(name = "projectMapper")
    private ProjectMapper projectMapper;

    public List<ProjectVo> getSelect() {
        return this.projectMapper.select();
    }

    public void insert(ProjectVo projectVo) {
         this.projectMapper.insert(projectVo);
    }

    public void update(ProjectVo projectVo) {
         this.projectMapper.update(projectVo);
    }

    public void delete(String project_name) {
         this.projectMapper.delete(project_name);
    }
}
