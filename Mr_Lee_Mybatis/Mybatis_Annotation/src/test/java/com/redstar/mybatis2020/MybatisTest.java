package com.redstar.mybatis2020;

import com.redstar.mybatis2020.entry.User;
import com.redstar.mybatis2020.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/7/30 11:02
 * @Description:
 * @Content:
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception{
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlConfig.xml");
        //创建工厂对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //创建sqlSession对象
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(com.redstar.mybatis2020.mapper.UserMapper.class);

        List<User> users = mapper.findAll();
        for(User user:users){
            System.out.println(user);
        }

        sqlSession.close();
        in.close();

    }
}
