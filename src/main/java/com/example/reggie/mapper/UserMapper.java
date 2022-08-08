package com.example.reggie.mapper;

// @DATE 2022/8/8
// @TIME 9:34
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
