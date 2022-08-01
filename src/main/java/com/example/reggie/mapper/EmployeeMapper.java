package com.example.reggie.mapper;

// @DATE 2022/8/1
// @TIME 12:30
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
