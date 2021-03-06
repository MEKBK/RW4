package com.kbk.service.Impl;

import com.kbk.dao.UserMapper;
import com.kbk.model.User;
import com.kbk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int insertSelective(User user){
        return userMapper.insertSelective(user);
    }

    @Override
    public User selectUserName(String username){
        return userMapper.selectUserName(username);
    }

}
