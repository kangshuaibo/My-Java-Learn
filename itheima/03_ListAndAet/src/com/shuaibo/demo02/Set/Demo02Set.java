package com.shuaibo.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口extends Collection接口
    Set接口的特点：
        1。不允许存储重复的元素
        2。没有索引，没有带索引的方法，也不能使用 普通的for循环遍历

     java.util.hashSet集合 implements Set接口
     HashSet特点：
           1。不允许存储重复的元素
           2。没有索引，没有带索引的方法，也不能使用普通的for循环遍历
           3。是一个无序的集合，存储元素和取出元素的顺序有可能不一致
           4。底层是一个哈希表结构（查询的速度非常快）
 */
public class Demo02Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add方法往集合中添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);     //没有添加上
        //使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);                  //
        }
        System.out.println("———————————你家没了—————————————");
        //使用增强for遍历set集合
        for (Integer i : set) {
            System.out.println(i);
        }










    }
}