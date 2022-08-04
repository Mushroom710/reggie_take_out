package com.example.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie.entity.Category;

// @DATE 2022/8/4
// @TIME 10:37
// @AUTHOR zhangzhi
// @DESCRIPTION

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
