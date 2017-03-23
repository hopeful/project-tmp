package com.wkb.insurance.service.impl;

import com.codahale.metrics.annotation.Timed;
import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import com.wkb.insurance.dao.mapper.UserMapper;
import com.wkb.insurance.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wkb.insurance.service.TestService;

/**
 * Created by hujie on 2017/3/16.
 */

@Service("testService")
@EnableMetrics
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Timed
    public String getStr() {

        return "TEST SERVICE";
    }

    @Override
    public User getUser(Integer id) {

        return userMapper.findUserById(id);
    }

    @Override
    public Integer addUser(User user) {

        return userMapper.insertUser(user);

    }
}
