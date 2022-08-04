package com.example.reggie.common;

// @DATE 2022/8/4
// @TIME 9:58
// @AUTHOR zhangzhi
// @DESCRIPTION

/**
 * 基于 ThreadLocal 封装工具类，用于保存和获取当前登录用户id
 * @author zhangzhi
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new InheritableThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
