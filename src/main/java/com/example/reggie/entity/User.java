package com.example.reggie.entity;

// @DATE 2022/8/8
// @TIME 9:32
// @AUTHOR zhangzhi
// @DESCRIPTION

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 * @author zhangzhi
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;


    //姓名
    private String name;


    //手机号
    private String phone;


    //性别 0 女 1 男
    private String sex;


    //身份证号
    private String idNumber;


    //头像
    private String avatar;


    //状态 0:禁用，1:正常
    private Integer status;
}
