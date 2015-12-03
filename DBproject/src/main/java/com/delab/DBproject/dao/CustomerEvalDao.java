package com.delab.DBproject.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "customerEvalDao")
public class CustomerEvalDao {
    @Resource(name = "customerEvalMapper")
    private CustomerEvalMapper customerEvalMapper;

    public List<CustomerEvalVo> getSelect() {
        return this.customerEvalMapper.select();
    }

    public void insert(CustomerEvalVo customerEvalVo) {
         this.customerEvalMapper.insert(customerEvalVo);
    }

    public void update(CustomerEvalVo customerEvalVo) {
         this.customerEvalMapper.update(customerEvalVo);
    }

    public void delete(CustomerEvalVo customerEvalVo) {
         this.customerEvalMapper.delete(customerEvalVo);
    }
}
