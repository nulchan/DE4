package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "colleagueEvalMapper")
public interface ColleagueEvalMapper {
    List<ColleagueEvalVo> select();

    void insert(ColleagueEvalVo colleagueEvalVo);
    void update(ColleagueEvalVo colleagueEvalVo);
    void delete(ColleagueEvalVo colleagueEvalVo);
}