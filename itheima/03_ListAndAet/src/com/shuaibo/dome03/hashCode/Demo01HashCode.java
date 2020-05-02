package com.shuaibo.dome03.hashCode;

import java.sql.SQLOutput;

/*
    哈希值：是一个十进制整数，由系统随机给出（就是对象的地址，是一个逻辑地址，是模拟出来的地址，不是数据实际存储的物理地址
    在Object类有一个方法，可以获取对象的哈希值
        int	hashCode() 返回该对象的哈希码值。
        hashCode方法的源码：
            public native int hashCode();
            native：代表该方法调用的是本地操作系统的方法
        equls方法：
             public boolean equals(Object obj) {
                    return (this == obj);
                }
        （在java.lang.Object中）
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用OIbject类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1); //761960786

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2); //581374081

        /*
        toString方法源码：
             return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */

        System.out.println(p1); //com.shuaibo.dome03.hashCode.Person@2d6a9952
        System.out.println(p2); //com.shuaibo.dome03.hashCode.Person@22a71081   就是上面的16进制
        System.out.println(p1==p2); //false


        /*
            String类的哈希值
                String类重写了Object类的hashCode方法

         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());  //96354
        System.out.println(s2.hashCode());  //96354

        System.out.println("重地".hashCode());            //1179395
        System.out.println("通话".hashCode());            //1179395
    }
}
