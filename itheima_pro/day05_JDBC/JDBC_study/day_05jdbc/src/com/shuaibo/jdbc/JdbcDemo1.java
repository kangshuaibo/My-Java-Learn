package com.shuaibo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.倒入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","shuaibo","123");
        //4.定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        //5。获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();

    }
}

/*
    详解对象：
    1。DriverManager：驱动管理对象
        功能：
             （1）注册驱动：告诉程序该使用哪一个数据库jar包
                static void	registerDriver​(Driver driver)	使用 DriverManager注册给定的驱动程序。
                写代码使用：Class.forName("com.mysql.cj.jdbc.Driver");    静态代码块，随着类的加载自动执行
                通过查看源码发现：在com.mysql.cj.jdbc.Driver类中存在静态代码块
                static {
                    try {
                        DriverManager.registerDriver(new Driver());
                    } catch (SQLException var1) {
                        throw new RuntimeException("Can't register driver!");
                    }
                }
             （2）获取数据库连接
                方法：static Connection	getConnection​(String url, Properties info)	尝试建立与给定数据库URL的连接。
                参数：url：指定连接的路径
                        语法:jdbc:mysql://ip地址:端口号/数据库名称
                        例子: jdbc:mysql://localhost:3306/db3","shuaibo","123"
                        细节：如果连接的是本机mysql服务器，并且mysql服务器默认端口是3306，则url可简写为jdbc:mysql:///数据库名称
                     用户名
                     密码
    2。Connection：数据库连接对象
        功能：
            （1）获取执行sql的对象
                  * Statement	createStatement​()	创建一个 Statement对象，用于将SQL语句发送到数据库。
                    PreparedStatement	prepareStatement​(String sql)	创建一个 PreparedStatement对象，用于将参数化的SQL语句发送到数据库。
            （2）管理事务
                    开启事务：void	setAutoCommit​(boolean autoCommit)	调用该方法设置参数为false，即开启事务
                    提交事务：void	commit​()
                    回滚事务：void	rollback​()
    3。Statement：执行sql的对象
        执行sql：
            （1）boolean	execute​(String sql)    可以执行任意sql 了解
            （2）int	executeUpdate​(String sql)  执行DML（insert update delete）、DDL(create alter drop )
                返回值：影响的值，可以通过这个影响的行数判断DML语句是否执行成功，返回值>0的则执行成功，反之则失败
            （3）ResultSet	executeQuery​(String sql)：执行DQL（select）语句
        练习：
            account表 添加一条记录
            account表 修改一条记录
            account表 删除一条记录

    4。ResultSet：结果集对象，就是来封装查询结果的
        boolean next(): 游标向下移动一行，判断当前行是否是最后一行末尾（是否有数据），是，返回false,不是返回true
        getXxx():获取数据
            Xxx:代表数据类型  如：int getInt()      String getString();
            参数：
                Int:代表列的编号，从1开始 如：getString(1)
                String:代表列的名称   如：getDouble("balance");
         注意：
            使用步骤：
                游标向下移动一行
                判断是否有数据
                获取数据
        练习：
            查询emp表的数据将其封装为对象，然后装载集合，返回。
                （1）定义Emp类
                （2）定于方法 public List<Emp> findAll(){}
                （3）实现方法 select * from emp
    5。PreparedStatement：执行sql的对象
        （1）SQL注入问题：在拼接sql时，有一些sql的特殊关键字参与字符串的拼接，会造成安全性问题
            输入用户名随便，输入密码：a' or 'a' = 'a
            SQL:select * from user where username = 'lksdjfg' and password = 'a' or 'a' = 'a';
        （2）解决sql注入问题，使用preparedStatement对象来解决
        （3）预编译SQL注入问题：使用PreparedStatement对象来解决
        （4）步骤：
                倒入驱动包
                注册驱动
                获取数据库连接对象Connection
                定义sql
                    注意：sql的参数使用？作为占位符 如：select * from user where username = ？ and password = ?
                获取执行sql对象 PreparedStatement Conncetion.prepareStatement(String sql)
                给？赋值：
                    方法：setXxx(参数1，参数2)
                    参数1：?的位置编号 从1开始
                    参数2：？的值
                执行sql，接收返回结果，不需要传递sql语句
                处理结果
                释放资源
        (5) 注意：后期都会使用PreparedStatement来完成增删改查的所有操作
            可以防止SQL注入
            效率更高





## 抽取JDBC工具类：JDBCUtils
    目的：简化书写
    分析：
        1。注册驱动也抽取
        2。抽取一个方法获取连接对象
            需求：不想传递参数（麻烦），还得保证工具类的通用性
            解决：配置文件
                jdbc.properties
                    url =
                    user =
                    password =

        3。抽取一个方法 释放资源





## JDBC控制事务：
     1。事务：一个包含多个步骤的业务操作。如果这个业务操作被事务管理，则这多个步骤要么同时成功，要么同时失败
     2。操作：
        开启事务
        提交事务
        会滚事务
     3。使用Connection对象来管理事务
            开启事务：void	setAutoCommit​(boolean autoCommit)	调用该方法设置参数为false，即开启事务
                在执行sql之前开启事务
            提交事务：void	commit​()
                当所有sql都执行完提交事务
            回滚事务：void	rollback​()
                在catch中回滚事务

 */
