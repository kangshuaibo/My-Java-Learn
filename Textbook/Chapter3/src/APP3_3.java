import java.io.*;
public class APP3_3 //从键盘输入数据
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader buf;
        String str;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符串");
        str=buf.readLine();  //通过对象调用方法读取字符串 然后存放到str中
        System.out.println("您输入的字符串是："+str);
    }



}
