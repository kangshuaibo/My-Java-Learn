package com.shuaibo.mybatis.sqlsession;

import com.shuaibo.mybatis.cfg.Configuration;
import com.shuaibo.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.shuaibo.mybatis.utils.XMLConfigBuilder;
//import com.sun.org.apache.xerces.internal.xni.parser.XMLComponentManager;

import java.io.InputStream;

/**
 * 用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {
    /**
     *  根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
