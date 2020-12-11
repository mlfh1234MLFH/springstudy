package com.redstar.server.impl;

import com.redstar.mapper.AccountMapper;
import com.redstar.mapper.impl.AccountMapperImpl;
import com.redstar.server.AccountServer;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/8/3 17:25
 * @Description:
 * @Content:
 */
public class AccountServerImpl implements AccountServer {

    String[] str;
    List<String> list;
    Map<String,String> map;

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(str));
        System.out.println(list);
        System.out.println(map);
    }
}
