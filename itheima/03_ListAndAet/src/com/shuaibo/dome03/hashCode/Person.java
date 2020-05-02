package com.shuaibo.dome03.hashCode;

public class Person extends Object {
  /*  在Object类有一个方法，可以获取对象的哈希值
    int	hashCode() 返回该对象的哈希码值。
    hashCode方法的源码：
    public native int hashCode();
    native：代表该方法调用的是本地操作系统的方法
    equls方法：
    public boolean equals(Object obj)
                 return (this == obj);*/


    //重写hashCode方法

    @Override
    public int hashCode() {
        return 1;
    }
}
