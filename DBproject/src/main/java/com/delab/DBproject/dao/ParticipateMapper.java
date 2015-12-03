package com.delab.DBproject.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "participateMapper")
public interface ParticipateMapper {
    List<ParticipateVo> select();

    ParticipateVo selectOne(int project_num);
    void insert(ParticipateVo participateVo);
    void update(ParticipateVo participateVo);
    void delete(ParticipateVo participateVo);
}