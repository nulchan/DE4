package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "managementMapper")
public interface ManagementMapper {
    List<ManagementVo> select();

    void insert(ManagementVo managementVo);
    void update(ManagementVo managementVo);
    void delete(String management);
}