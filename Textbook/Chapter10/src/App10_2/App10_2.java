package App10_2;
//利用FileInputStream和FileOutputStream来实现对二进制图像文件的复制
import java.io.*;
public class App10_2
{
    public static void main(String[] args)throws IOException
    {
        FileInputStream fi = new FileInputStream("/Users/kangshuaibo/Desktop/风景.jpg");
        FileOutputStream fo = new FileOutputStream("/Users/kangshuaibo/Desktop/风景copy.jpg");
        System.out.println("文件大小="+fi.available());
        byte[] b=new byte[fi.available()]; //创建byte类型数组b
        fi.read(b);
        fo.write(b);
        System.out.println("文件已被复制并更名");
        fi.close();
        fo.close();
    }
}
