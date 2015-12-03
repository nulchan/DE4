package com.delab.DBproject.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "participateDao")
public class ParticipateDao {
    @Resource(name = "participateMapper")
    private ParticipateMapper participateMapper;

    public List<ParticipateVo> getSelect() {
        return this.participateMapper.select();
    }
    
    public ParticipateVo getSelectOne(int project_num) {
        return this.participateMapper.selectOne(project_num);
    }

    public void insert(ParticipateVo participateVo) {
         this.participateMapper.insert(participateVo);
    }

    public void update(ParticipateVo participateVo) {
         this.participateMapper.update(participateVo);
    }

    public void delete(ParticipateVo participateVo) {
         this.participateMapper.delete(participateVo);
    }
}
