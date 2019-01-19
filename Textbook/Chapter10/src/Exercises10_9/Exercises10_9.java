package Exercises10_9;
//利用文件输入输出流打开上题文件file1.txt，然后在末尾追加一行："又添加了一行文字"
import java.io.*;
public class Exercises10_9
{
    public static void main(String[] args)throws IOException
    {
        FileWriter fw = new FileWriter("file.txt",true);
        fw.write("\r\n又添加了一行文字");
        fw.close();
    }
}
