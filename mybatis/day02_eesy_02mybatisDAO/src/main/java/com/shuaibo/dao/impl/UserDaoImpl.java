package com.shuaibo.dao.impl;

import com.shuaibo.dao.IUserDao;
import com.shuaibo.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;
    //为了保证factory有值，用构造函数传个值
    public UserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;
    }


    public List<User> findAll() {
        //1。根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        //2.调用SqlSession中的方法，实现查询列表
        List<User> users = session.selectList("com.shuaibo.dao.IUserDao.findAll"); //参数就是能获取配置信息的key
       //3.释放资源
        session.close();
        return users;
    }

    public void saveUser(User user) {
        //1.根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        //2.调用方法实现保存
        session.insert("com.shuaibo.dao.IUserDao.saveUser",user);
        //3.提交事务
        session.commit();
        //4.释放资源
          session.close();
    }

    public void updateUser(User user) {
        //1.根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        //2.调用方法实现更新
        session.update("com.shuaibo.dao.IUserDao.updateUser",user);
        //3.提交事务
        session.commit();
        //4.释放资源
        session.close();
    }

    public void deleteUser(Integer userId) {
        //1.根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        //2.调用方法实现更新
        session.delete("com.shuaibo.dao.IUserDao.deleteUser",userId);
        //3.提交事务
        session.commit();
        //4.释放资源
        session.close();
    }

    public User findById(Integer userId) {
        //1。根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        //2.调用SqlSession中的方法，实现查询列表
        User user = session.selectOne("com.shuaibo.dao.IUserDao.findById",userId);
        //3.释放资源
        session.close();
        return user;
    }

    public List<User> findByName(String username) {
        //1。根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        //2.调用SqlSession中的方法，实现查询列表
        List<User> users = session.selectList("com.shuaibo.dao.IUserDao.findByName",username);
        //3.释放资源
        session.close();
        return users;
    }

    public int findTotal() {
        //1。根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        //2.调用SqlSession中的方法，实现查询列表
        Integer count = session.selectOne("com.shuaibo.dao.IUserDao.findTotal");
        //3.释放资源
        session.close();
        return count;
    }
}
