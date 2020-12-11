package com.redstar.mapper;

import com.redstar.entry.Account;

import java.util.List;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/7/31 16:32
 * @Description:
 * @Content:
 */
public interface AccountMapper {

    List<Account> findAll();
    List<Account> findAccountUser();
}
