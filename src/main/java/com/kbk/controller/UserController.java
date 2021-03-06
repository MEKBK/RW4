package com.kbk.controller;


import com.kbk.model.User;
import com.kbk.service.Impl.UserServiceImpl;
import com.kbk.util.CookieUtil;
import com.kbk.util.JWTUtil;
import com.kbk.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/02/26 10:14
 * @Version 1.0
 *
 */

@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/LoginSuccessful", method = RequestMethod.GET)
    public String LoginSuccessful() {
        return "LoginSuccessful";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(HttpServletRequest request, Model model, HttpServletResponse response){

        //获取账号密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userService.selectUserName(username);

            //验证该用户是否存在,并判断密码是否相等
            if (user != null && password.equals(user.getPassword())) {

                String passwrod = user.getPassword();

                //给登录进来的用户加盐
                String md5Str= MD5Util.getMD5Str(passwrod);

                //判断加盐后密码是否一致
                boolean flag=MD5Util.getSaltverifyMD5(user.getPassword(),md5Str);

                if (flag) {
                    //生成token
                    String token = JWTUtil.getJWT("1", user.getUsername(), new Date(), "1234");
                    //把token装到cookie中发送到客户端
                    CookieUtil.setCookie(response, "token", token, 60 * 3);
                    return "redirect:LoginSuccessful";
                } else {
                    return "login";
                }
            } else {
                model.addAttribute("msg", "用户名或者密码错误");
                return "login";
            }



    }

}
