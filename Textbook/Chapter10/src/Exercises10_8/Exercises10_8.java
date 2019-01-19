package Exercises10_8;
import java.io.*;
//利用文件输入流打开上题中创建的文件file1.txt，读出其内容并显示在屏幕上。
public class Exercises10_8
{
    public static  void main(String[] args)throws IOException
    {
        char c[] = new char[500];
        FileReader fr = new FileReader("file.txt");

        int num = fr.read(c);   //返回数组长度
        String str = new String(c,0,num); //从0到c数nmu个字符赋值给str
        System.out.println(str);
        fr.close();
    }
}
