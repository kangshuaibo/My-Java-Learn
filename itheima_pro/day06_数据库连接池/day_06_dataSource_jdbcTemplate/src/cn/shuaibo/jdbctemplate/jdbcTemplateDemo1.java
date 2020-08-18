package cn.shuaibo.jdbctemplate;

import cn.shuaibo.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/*
    jdbcTemplate入门
 */
public class jdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 5001 where id = ?";

        int count = template.update(sql,4);
        System.out.println(count);
    }
}
