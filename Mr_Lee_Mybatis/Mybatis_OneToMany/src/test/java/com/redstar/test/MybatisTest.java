package com.redstar.test;


import com.redstar.entry.Account;
import com.redstar.mapper.AccountMapper;
import com.redstar.mapper.UserMapper;
import com.redstar.entry.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/7/30 10:15
 * @Description:
 * @Content:
 */
public class MybatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private AccountMapper accountMapper;

    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
        accountMapper = sqlSession.getMapper(AccountMapper.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll(){
        //5.执行查询所有方法
        List<Account> accounts = accountMapper.findAll();
        for(Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountUser(){
        List<Account> accountUser = accountMapper.findAccountUser();
        for(Account acc: accountUser){
            System.out.println(acc);
        }
    }
}
