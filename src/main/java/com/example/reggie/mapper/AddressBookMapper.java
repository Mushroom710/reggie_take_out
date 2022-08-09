package com.example.reggie.mapper;

// @DATE 2022/8/9
// @TIME 8:59
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
