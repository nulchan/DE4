package com.delab.DBproject.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "managementDao")
public class ManagementDao {
    @Resource(name = "managementMapper")
    private ManagementMapper managementMapper;

    public List<ManagementVo> getSelect() {
        return this.managementMapper.select();
    }

    public void insert(ManagementVo managementVo) {
         this.managementMapper.insert(managementVo);
    }

    public void update(ManagementVo managementVo) {
         this.managementMapper.update(managementVo);
    }

    public void delete(String management_name) {
         this.managementMapper.delete(management_name);
    }
}
