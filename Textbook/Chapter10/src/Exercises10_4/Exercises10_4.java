package Exercises10_4;
import java.io.*;

public class Exercises10_4
{
    public static void main(String[] args)
    {
        FileInputStream fin = new FileInputStream(FileDescriptor.in);
        FileOutputStream fout = new FileOutputStream(FileDescriptor.out);   //对象是否代表有效文件夹
        char ch;
        try
        {
            System.out.println("请输入一个字符");
            ch = (char)fin.read();//读取键盘上的一个一个一个一个字符

            System.out.println("您输入的字符是");
            fout.write(ch); //显示读入的字符在屏幕上

            fin.close();
            fout.close();
        }
        catch (Exception e){}
    }
}
