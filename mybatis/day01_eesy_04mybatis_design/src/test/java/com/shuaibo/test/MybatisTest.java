package com.shuaibo.test;

import com.shuaibo.dao.IUserDao;
import com.shuaibo.domain.User;
import com.shuaibo.mybatis.io.Resources;
import com.shuaibo.mybatis.sqlsession.SqlSessionFactoryBuilder;
import com.shuaibo.mybatis.sqlsession.SqlSessionFactory;
import com.shuaibo.mybatis.sqlsession.SqlSession;
/*import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;*/

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *  mybatis的入门案例
 */
public class MybatisTest {
    /**
     *  入门案例
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1。读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3。使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4。使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class); //获取IUserDao的Class对象
        //5。使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //6。释放资源
        session.close();
        in.close();
    }
}
