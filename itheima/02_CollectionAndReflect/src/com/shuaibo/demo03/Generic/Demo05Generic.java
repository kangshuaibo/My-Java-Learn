package com.shuaibo.demo03.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符；
        ？：代表任意数据类型
     使用方法：
        不能创建对象使用
        只能作为方法参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String>  list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

       // ArrayList<?>  list03 = new ArrayList<?>();    //定义时不能用，参数传递时才能用

    }
    /*
        定义一个方法，能遍历所有类型的ArrayList集合
        这时候我们不知道ArrayList集合使用什么数据类型，可以使用泛型的通配符？来接收数据类型
        注意：
            泛型没有继承概念：Integer list02报错 String list01报错 Object都报错：没有继承
     */
    public static void printArray(ArrayList<?> list) {
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()){//创建GenericInterfaceImpl1对象
            //it.next()方法，取出的元素是Object，可以接受任意的数据类型
            Object next = it.next();
            System.out.println(next);
        }


    }
}
