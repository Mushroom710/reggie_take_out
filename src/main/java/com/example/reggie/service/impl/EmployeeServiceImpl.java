package com.example.reggie.service.impl;

// @DATE 2022/8/1
// @TIME 12:34
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie.entity.Employee;
import com.example.reggie.mapper.EmployeeMapper;
import com.example.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
