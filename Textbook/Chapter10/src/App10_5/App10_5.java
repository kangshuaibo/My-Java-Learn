package App10_5;
//利用FileReader类读取桌面内容
import java.io.*;
public class App10_5
{
    public static void main(String[] args)throws IOException
    {
        char[] c= new char[150];
        FileReader fr =new FileReader("/Users/kangshuaibo/Desktop/test.txt");
        int num = fr.read(c);   //将数组存到c内 并返回数组的字符数 可能会抛出异常 在主方法让系统捕获
        String str = new String(c,0,num);  //将数组转换成字符串
        System.out.println("输入的数组为"+num+"内容如下");
        System.out.println(str);
        fr.close();

    }
}
