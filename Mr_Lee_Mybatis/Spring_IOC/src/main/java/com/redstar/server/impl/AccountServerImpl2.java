package com.redstar.server.impl;

import com.redstar.server.AccountServer;

import java.util.Date;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/8/4 15:50
 * @Description:
 * @Content:
 */
public class AccountServerImpl2 implements AccountServer {
    String name;
    Integer age;
    Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void saveAccount() {
        System.out.print("输出 name: " + name + " age: " + age + " date: " + date);
    }
}
