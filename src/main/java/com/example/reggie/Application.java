package com.example.reggie;

// @DATE 2022/8/1
// @TIME 10:15
// @AUTHOR zhangzhi
// @DESCRIPTION

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @ServletComponentScan 注解用于扫描过滤器类
 * @author zhangzhi
 */

@Slf4j
@SpringBootApplication
@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        log.info("项目启动成功");
    }
}
