package com.redstar.mapper;

import java.util.List;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/7/29 17:53
 * @Description:
 * @Content:
 */
public interface UserMapper<User> {

     List<User> findAll();

     void saveUser(User user);

     void updateUser(User user);

     void deleteUser(Integer id);

     User findById(Integer id);

}
