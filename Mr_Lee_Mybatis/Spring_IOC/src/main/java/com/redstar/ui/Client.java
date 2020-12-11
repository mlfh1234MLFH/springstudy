package com.redstar.ui;

import com.redstar.server.AccountServer;
import com.redstar.server.impl.AccountServerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/8/3 17:37
 * @Description:
 * @Content:
 */
public class Client {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("perproties.xml");

        AccountServer bean =  (AccountServer)ac.getBean("AccountServer");

        bean.saveAccount();
    }
}
