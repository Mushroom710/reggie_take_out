package com.example.reggie.common;

// @DATE 2022/8/4
// @TIME 11:15
// @AUTHOR zhangzhi
// @DESCRIPTION

/**
 * 自定义业务异常类
 * @author zhangzhi
 */
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
