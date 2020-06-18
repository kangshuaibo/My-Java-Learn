package com.shuaibo.demo01.File;

import java.io.File;

/*
File判断功能的方法：
    public boolean exists() ：此File表示的文件或目录是否实际存在。
    public boolean isDirectory() ：此File表示的是否为目录。
    public boolean isFile() ：此File表示的是否为文件。
 */
public class Demo04File {
    public static void main(String[] args) {
        show02();
    }

    /*
        public boolean isDirectory() ：此File表示的是否为目录。
            用于判断构造方法中给定的路径是否以文件夹结尾
                是：true
                否：false
        public boolean isFile() ：此File表示的是否为文
            用于判断构造方法中给定的路径是否以文件结尾
                是：true
                否：false
        注意：
            电脑的硬盘中只有文件/文件夹，两个方法是互斥
            这两个方法使用前提，路径必须是存在的，否则都返回false

     */
    private static void show02() {
        File f1 = new File("/Users/kangshuaibo/Desktop/My-Java-Learn/itheima/res/c");
        if(f1.exists()){    //不存在 不用判断
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        File f2 = new File("/Users/kangshuaibo/Desktop/My-Java-Learn/itheima/res/a"); //是文件夹
        if(f2.exists()){
            System.out.println(f2.isDirectory());   //true
            System.out.println(f2.isFile());    //false
        }

        File f3 = new File("/Users/kangshuaibo/Desktop/My-Java-Learn/itheima/res/a/1.jpg"); //是文件
        if(f2.exists()){
            System.out.println(f3.isDirectory());   //false
            System.out.println(f3.isFile());    //true
        }



    }


    /*
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在：true
            不存在：false
     */
    private static void show01() {
        File f1 = new File("/Users/kangshuaibo/Desktop/My-Java-Learn/itheima/res/a");   //true
        System.out.println(f1.exists());

        File f2 = new File("/Users/kangshuaibo/Desktop/My-Java-Learn/itheima/res/c");   //false
        System.out.println(f2.exists());

        File f3 = new File("笔记");   //true当前项目路径的相对路径
        System.out.println(f3.exists());    ///Users/kangshuaibo/Desktop/My-Java-Learn/itheima/笔记
    }
}
