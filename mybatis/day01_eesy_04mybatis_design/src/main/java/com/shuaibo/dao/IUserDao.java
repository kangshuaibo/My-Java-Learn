package com.shuaibo.dao;

import com.shuaibo.domain.User;
import com.shuaibo.mybatis.annotations.Select;

import java.util.List;

/**
 *  用户的持久层接口
 */
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
