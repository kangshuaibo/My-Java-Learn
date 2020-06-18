package com.shuaibo.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类。

    定义了所有子类的共性方法：
         int	read() 从输入流中读取数据的下一个字节。
         int	read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。

    java.io.FileInputStream extends InputStream
    FileInputStream:文件字节输入流
    作用：把硬盘文件中的数据，读取到内存中

    构造方法：
        FileInputStream(String name)
        FileInputStream(File file)
        参数：读取文件的数据源
            String name:文件的路径
            File file：文件
        构造方法的作用：
            1。会创建一个FileInputStream对象
            2。会把FileInputStream对象指向构造方法中要读取的文件

    读取数据的原理（硬盘-->内存）
        java程序 --> JVM --> OS --> OS读取数据的方法 --> 读取文件

     字节输入流的使用步骤（重点）：
        1。创建FileInputStream对象，构造方法中绑定要读取的数据源
        2。使用FIleInputStream对象中的方法read，读取文件
        3。释放资源

 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
       // 1。创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("09_IOAndProperties/a.txt");
        //2。使用FIleInputStream对象中的方法read，读取文件
        //int	read() 从输入流中读取数据的下一个字节并返回,读取到文件末尾返回-1
/*      int len = fis.read(); //一次读取一个字节
        System.out.println(len);    //97 a

        len = fis.read();           //再读一次指针后移
        System.out.println(len);    //98 b

        len = fis.read();
        System.out.println(len);    //99c

        len = fis.read();
        System.out.println(len);    //-1 读取完毕

        len = fis.read();
        System.out.println(len);    //-1 再读取还是
*/
      /*
        我们发现以上读取文件是一个重复过程，所以可以使用循环优化
        不知道文件中有多少个字节，使用while循环
        while循环结束条件，读取到-1的时候结束


       */

       /*
          错误写法


          while (fis.read()!=-1){
              System.out.println(fis.read());   //因为判断时读了，指针后移，这里又读了 输出结果98-1
          } //所以要有一个变量接收读取到的数据 ，打印这个接收的数据
       */

        int len = 0; //记录读取到的字节
        while ((len = fis.read()) != -1){   //固定写法
            System.out.println((char) len); //abc
        }

        //3。释放资源
        fis.close();


    }
}
