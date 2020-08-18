package com.shuaibo.mybatis.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  查询的注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //出现的位置
public @interface Select {
    /**
     *  配置Sql语句的
     * @return
     */
    String value();
}
