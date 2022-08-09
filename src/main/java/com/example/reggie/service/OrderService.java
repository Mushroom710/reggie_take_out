package com.example.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie.entity.Orders;

// @DATE 2022/8/9
// @TIME 10:03
// @AUTHOR zhangzhi
// @DESCRIPTION

public interface OrderService extends IService<Orders> {
    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
