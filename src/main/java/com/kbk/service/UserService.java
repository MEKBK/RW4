package com.kbk.service;


import com.kbk.model.User;
import org.springframework.stereotype.Service;

/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/03/03 10:14
 * @Version 1.0
 *
 */
@Service
public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertSelective(User user);

    /**
     * 查询用户名
     * @param username
     * @return
     */
    User selectUserName(String username);
}
