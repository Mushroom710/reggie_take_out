package com.example.reggie.config;

// @DATE 2022/8/2
// @TIME 10:38
// @AUTHOR zhangzhi
// @DESCRIPTION


import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor ret = new MybatisPlusInterceptor();
        ret.addInnerInterceptor(new PaginationInnerInterceptor());
        return ret;
    }
}
