package cn.shuaibo.annotation;

/**
 *  要求：
 * 			1. 属性的返回值类型有下列取值
 * 				* 基本数据类型
 * 				* String
 * 				* 枚举
 * 				* 注解
 * 				* 以上类型的数组
 */
public @interface MyAnno {
    //public abstract String show();
    //int show1();
    //int age();
    int value();    //只有一个属性且是value()，用时可以省略value，直接写数@MyAnno(value = 12) => @MyAnno(12)
    //String name() default "张三";
    Person per();
    MyAnno2 anno2();
    String[] strs();    //赋值时要用打括号包裹，若只有一个值可以省略大括号





/*
每种都试一下
    String show2();
    Person per();
    MyAnno2 anno2();

    String[] strs();
    //Worker w(); //报错
  */
}
