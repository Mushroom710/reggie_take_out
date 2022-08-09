package com.example.reggie.controller;

// @DATE 2022/8/9
// @TIME 10:19
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.reggie.common.BaseContext;
import com.example.reggie.common.R;
import com.example.reggie.entity.Orders;
import com.example.reggie.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 用户下单
     * @param orders
     * @return
     */
    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders orders){
        log.info("订单数据：{}",orders);
        orderService.submit(orders);
        return R.success("下单成功");
    }

    /**
     * TODO
     * 查询所有订单
     * @return
     */
    @GetMapping("/list")
    public R<List<Orders>> list(Orders orders){
        orders.setUserId(BaseContext.getCurrentId());
        log.info("orders:{}",orders);

        LambdaQueryWrapper<Orders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(null != orders.getUserId(), Orders::getUserId, orders.getUserId());
        queryWrapper.orderByDesc(Orders::getCheckoutTime);

        List<Orders> list = orderService.list(queryWrapper);
        log.info(list.toString());

        return R.success(orderService.list(queryWrapper));
    }

    /**
     * TODO
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/userPage")
    public R<List<Orders>> page(int page,int pageSize){
        LambdaQueryWrapper<Orders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq( Orders::getUserId, BaseContext.getCurrentId());
        queryWrapper.orderByDesc(Orders::getCheckoutTime);

        List<Orders> list = orderService.list(queryWrapper);
        log.info(list.toString());

        return R.success(orderService.list(queryWrapper));
    }

    /**
     * TODO
     * 再来一单
     * @param orders
     * @return
     */
    @PostMapping("/again")
    public R<String> again(@RequestBody Orders orders){
        return R.success("开发中。。。");
    }
}
