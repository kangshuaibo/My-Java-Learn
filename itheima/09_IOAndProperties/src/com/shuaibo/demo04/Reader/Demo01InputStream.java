package com.shuaibo.demo04.Reader;

import java.io.FileInputStream;
import java.io.IOException;

/*
    使用字节流读取中文文件 存在问题：乱码
    1个中文：
        GBK：占用两个字节
        UTF-8：占用3个字节
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("09_IOAndProperties/c.txt");
        int len = 0;
        while ((len = fis.read()) != -1){
            System.out.println((char)len); //u8三个字节组成一个字符，一次读取三分之一个字节，会产生乱码
        }
        fis.close();
    }
}
