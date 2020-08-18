package com.shuaibo.dao.impl;

import com.shuaibo.dao.IUserDao;
import com.shuaibo.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    //2。定义一个能拿到session对象的
    private SqlSessionFactory factory;
    //3。如何保证factory有值呢，在创建的时候有值就行了，把默认构造函数给覆盖掉
    public UserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;
    }

    //1。调用session的select。要定义一个能拿到session的
    public List<User> findAll(){
        //1使用工厂创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询所有方法
        List<User> users = session.selectList("com.shuaibo.dao.IUserDao.findAll");
        //3.返回查询结果
        return users;
    }
}
