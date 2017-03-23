package com.wkb.insurance.service;

import com.wkb.insurance.module.User;

/**
 * Created by hujie on 2017/3/16.
 */
public interface TestService {

    public String getStr();

    public User getUser(Integer id);

    public Integer addUser(User user);
}
