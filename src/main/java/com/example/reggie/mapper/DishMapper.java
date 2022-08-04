package com.example.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

// @DATE 2022/8/4
// @TIME 10:56
// @AUTHOR zhangzhi
// @DESCRIPTION

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
