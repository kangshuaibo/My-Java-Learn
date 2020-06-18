package com.shuaibo.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次写多个字节的方法：
         public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
         public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("09_IOAndProperties/b.txt"));
        //调用FileOutputStream对象中的方法write，把数据写入到文件中
        //在文件中写入100，写几个字节
        fos.write(49);
        fos.write(48);
        fos.write(48);  //答：3字节 byte

        /*
            public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
            一次写多个字节：
                如果写的第一个字节是正数（0-127），那么显示的时候会查询ASCII表
                如果写的第一个字节是负数，那第一个字节会和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）
         */
        byte[] bytes = {65,66,67,68,69};    //ABCDE
      //  byte[] bytes = {-65,-66,-67,68,69};    //烤侥E
        fos.write(bytes);

        /*
             public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
                int off：数组的开始索引
                int len：写几个字节
         */
        fos.write(bytes,1,2);   //BC

        /*
            写入字符串的方法：可以使用String类中的方法把字符串，转换为字节数组
                byte[] getBytes() 把字符串转换为字节数组
         */
        byte[] bytes2 = "你好".getBytes();    //这个方法返回字节数组
        System.out.println(Arrays.toString(bytes2)); //打印看一下[-28, -67, -96, -27, -91, -67]  ==>   utf-8三个字节是一个中文，GBK中两个字节是一个中文
        fos.write(bytes2);//把字节数组写到文件

        //释放资源
        fos.close();
    }
}
