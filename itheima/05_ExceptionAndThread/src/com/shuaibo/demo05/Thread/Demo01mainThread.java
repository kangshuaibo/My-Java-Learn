package com.shuaibo.demo05.Thread;
/*
    主线程：执行主（main）方法的线程

    单线程程序：java程序中只有一个线程
    执行从main方法开始，从上到下依次执行

    JVM执行main方法，main方法会进入到栈内存
    JVm会找操作系统开辟一条main方法通向cpu的执行路径
 */
public class Demo01mainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
//        System.out.println(0/0);    //ArithmeticException: / by zero
        Person p2 = new Person("旺财");
        p2.run();
    }
}
