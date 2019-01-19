package Exercises10_7;
import java.io.*;
//利用文件输出流创建一个文件file1.txt，写入字符"文件已被成功创建！"，然后用记事本打开该文件
public class Exercises10_7
{
    public static void main(String args[])throws IOException
    {
        File f= new File("file.txt");
        f.createNewFile();//用文件类File的对象f掉调用方法创建文件

        FileWriter fw = new FileWriter(f); //以f为参数 创建fw对象 FileWriter向流中写入数据
        String str = "文件已经被成功创建";   //创建str对象

        fw.write(str);//fw调用以str为参数的方法write 将字符串写入文件
        fw.close();
    }
}
