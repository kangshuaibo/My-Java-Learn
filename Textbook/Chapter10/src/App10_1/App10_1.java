package App10_1;
//在程序中创建一个文本文件myfile.txt，写入从键盘输入的一串字符，然后在读取该文件并将文本文件内容显示在屏幕上
import java.io.*;
class App10_1
{
    public static void main(String[] args)
    {
        FileInputStream fin;    //声明文件字节输入流对象fin
        FileOutputStream fout;
        char ch;
        int data=0;
        try
        {
            fin = new FileInputStream(FileDescriptor.in); //创建标准输入流对象即键盘输入
            fout = new FileOutputStream("/Users/kangshuaibo/Desktop/myfile.txt"); //创建输出流对象文件
            System.out.println("请输入一串字符，并以#结束：");
            while (  (ch=(char)fin.read())!='#'  )//read和read将键盘数据写入文件
                fout.write(ch);
            fin.close();
            fout.close();

            //换行
            System.out.println();

            fin=new FileInputStream("/Users/kangshuaibo/Desktop/myfile.txt");//重新定义对象，调用各自的方法将文件中的内容输出到屏幕上
            fout=new FileOutputStream(FileDescriptor.out);
            while (fin.available()>0)
            {
                data=fin.read();
                fout.write(data);
            }
            fin.close();
            fout.write(data);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件没找到");
        }
        catch (IOException e)
        {

        }
    }
}
//注：文件生成在了桌面下(若只写文件名，默认生成在工程文件加下即与src同级别)
//win写法不同为：FileOutputStream("d:\\cgj\\myfile.txt")
