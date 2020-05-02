/*对比区别：：：：
* String类：
*   字符串是常量；他们的值在创建之后不能改变。
*   字符串的底层是一个被final修饰的数组，不能改变，是一个常量
*   private final byte[] value;
*
*   进行字符串的相加，内存中就会有多少个字符串，占用空间多，效率低下
*   String s = "a"+"b"+"c";     =>  String s "a","b","c" 3个字符串  "a"+"b"，"ab" 1个字符串 "ab"+ "c" +"abc" 1个字符串 =>共5个字符串
*
*StringBuilder类：
*   字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
*   底层也是一个数组，但是没有被final修饰，可以改变长度
*   byte[] value = new byte[16];
*   StringBuillder在内存中始终是一个数组，占用空间少，效率高，如果超出了StringBuilder类的容量，就会自动扩容
*
*   */

package demo06.StringBuilder;

import java.sql.SQLOutput;

/*
java.lang.StringBuilder类： 字符串缓冲区，可以提高字符串的效率
    构造方法：
*       StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
*       StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。


 */
public class Demo01StringBuilder
{
    public static void main(String[] args) {
        //空参数构造方法
        StringBuffer bu1 = new StringBuffer();
        System.out.println("bu1:" + bu1); //bu1:"" 默认是一个空字符串 什么都没有

        //带字符串的构造方法
        StringBuffer bu2 = new StringBuffer("abc");
        System.out.println("bu2:" + bu2);   //bu2:abc   不是地址 重写了toString方法
    }
}
