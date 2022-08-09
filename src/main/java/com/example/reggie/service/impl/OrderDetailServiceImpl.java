package com.example.reggie.service.impl;

// @DATE 2022/8/9
// @TIME 10:10
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie.entity.OrderDetail;
import com.example.reggie.mapper.OrderDetailMapper;
import com.example.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
