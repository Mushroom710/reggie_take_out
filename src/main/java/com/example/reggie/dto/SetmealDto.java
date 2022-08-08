package com.example.reggie.dto;

// @DATE 2022/8/8
// @TIME 8:40
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.reggie.entity.Setmeal;
import com.example.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {
    private List<SetmealDish> setmealDishes;
    private String categoryName;
}
