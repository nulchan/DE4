package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "pmEvalMapper")
public interface PMEvalMapper {
    List<PMEvalVo> select();

    void insert(PMEvalVo pmEvalVo);
    void update(PMEvalVo pmEvalVo);
    void delete(PMEvalVo pmEvalVo);
}