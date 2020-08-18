package com.shuaibo.mybatis.sqlsession.defaults;

import com.shuaibo.mybatis.cfg.Configuration;
import com.shuaibo.mybatis.sqlsession.SqlSession;
import com.shuaibo.mybatis.sqlsession.SqlSessionFactory;

/**
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }
    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    public SqlSession openSession() {

        return new DefaultSqlSession(cfg);
    }
}
