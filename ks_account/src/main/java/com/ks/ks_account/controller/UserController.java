package com.ks.ks_account.controller;

import com.ks.ks_account.entity.ResultBody;
import com.ks.ks_account.entity.User;
import com.ks.ks_account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public ResultBody findAll() {
        List<User> users = userService.findAll();
        return ResultBody.success(users);
    }

    // 接受用户登录.获取令牌.存redis.使用springSecurity+oth2
}
