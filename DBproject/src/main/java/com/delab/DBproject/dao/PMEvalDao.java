package com.delab.DBproject.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "pmEvalDao")
public class PMEvalDao {
    @Resource(name = "pmEvalMapper")
    private PMEvalMapper pmEvalMapper;

    public List<PMEvalVo> getSelect() {
        return this.pmEvalMapper.select();
    }

    public void insert(PMEvalVo pmEvalVo) {
         this.pmEvalMapper.insert(pmEvalVo);
    }

    public void update(PMEvalVo pmEvalVo) {
         this.pmEvalMapper.update(pmEvalVo);
    }

    public void delete(PMEvalVo pmEvalVo) {
         this.pmEvalMapper.delete(pmEvalVo);
    }
}
