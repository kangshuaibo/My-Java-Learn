package com.shuaibo.demo02.Recursion;

import java.io.File;

/*
    递归打印多级目录
        需求：
            遍历111文件夹，以及111文件夹的子文件夹
            只要.java结尾的文件

        分析：多级目录的打印，就是当目录的嵌套。遍历之前，无从知道到底有多少级目录，所以我们还是要使用递归实现。
 */
public class Demo05Recurison {
    public static void main(String[] args) {
        File file = new File("08_FileAndRecursion/111");
        getAllFile(file);
    }

    /*
        定义一个方法，参数传递File类型的目录                                                 /Users/kangshuaibo/Desktop/My-Java-Learn/itheima/08_FileAndRecursion
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        //System.out.println(dir);        //打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历的对象f判断 是否是文件夹
            if(f.isDirectory()){
                //是文件夹，继续遍历这个文件夹
                //getAllFile方法就是传递文件夹，遍历文件夹方法
                //所以直接调用getAllFile方法即可：递归（自己调用自己）
                getAllFile(f);
            }else {
           /*     //f是一个文件，直接打印即可
                *//*
                    111/aaa.java
                    只要.java结尾的文件
                    1。把file对象f，转换为字符串对象
                 *//*
                String name = f.getName();//aaa.java
                String path = f.getPath(); //.......111/aaa.java
                String s = f.toString();//也睡调用path方法 ......111/aaa.java
            //做一步优化
                path = path.toLowerCase();
                //2。调用String类中的方法endWith判断字符串是否是以.java结尾
                boolean b = name.endsWith(".java");

                    //3是。java结尾输出
                if(b){
                    System.out.println(path);
                }*/

                //链式编程
                if(f.getName().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }




            }
        }
    }
}
