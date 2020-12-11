package com.redstar.mybatis2020.mapper;

import com.redstar.mybatis2020.entry.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/7/30 10:57
 * @Description:
 * @Content:
 */
public interface UserMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
