package com.delab.DBproject.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "colleagueEvalDao")
public class ColleagueEvalDao {
    @Resource(name = "colleagueEvalMapper")
    private ColleagueEvalMapper colleagueEvalMapper;

    public List<ColleagueEvalVo> getSelect() {
        return this.colleagueEvalMapper.select();
    }

    public void insert(ColleagueEvalVo colleagueEvalVo) {
         this.colleagueEvalMapper.insert(colleagueEvalVo);
    }

    public void update(ColleagueEvalVo colleagueEvalVo) {
         this.colleagueEvalMapper.update(colleagueEvalVo);
    }

    public void delete(ColleagueEvalVo colleagueEvalVo) {
         this.colleagueEvalMapper.delete(colleagueEvalVo);
    }
}
