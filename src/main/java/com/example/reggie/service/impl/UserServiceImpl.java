package com.example.reggie.service.impl;

// @DATE 2022/8/8
// @TIME 9:34
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie.entity.User;
import com.example.reggie.mapper.UserMapper;
import com.example.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
