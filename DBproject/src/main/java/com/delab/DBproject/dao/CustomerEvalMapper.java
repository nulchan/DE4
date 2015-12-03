package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "customerEvalMapper")
public interface CustomerEvalMapper {
    List<CustomerEvalVo> select();

    void insert(CustomerEvalVo customerEvalVo);
    void update(CustomerEvalVo customerEvalVo);
    void delete(CustomerEvalVo customerEvalVo);
}