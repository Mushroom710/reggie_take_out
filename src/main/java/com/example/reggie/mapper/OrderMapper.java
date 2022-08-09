package com.example.reggie.mapper;

// @DATE 2022/8/9
// @TIME 10:03
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
