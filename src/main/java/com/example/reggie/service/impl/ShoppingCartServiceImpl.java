package com.example.reggie.service.impl;

// @DATE 2022/8/9
// @TIME 9:34
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie.entity.ShoppingCart;
import com.example.reggie.mapper.ShoppingCartMapper;
import com.example.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
