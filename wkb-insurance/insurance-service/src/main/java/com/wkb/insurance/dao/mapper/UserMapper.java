package com.wkb.insurance.dao.mapper;

import com.wkb.insurance.module.User;
import org.springframework.stereotype.Repository;

/**
 * Created by hujie on 2017/3/23.
 */
@Repository
public interface UserMapper {

    public User findUserById(Integer id);

    public Integer insertUser(User user);
}
