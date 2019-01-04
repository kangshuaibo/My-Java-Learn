import java.io.*;
public class APP4_6 //从键盘输入一个数 判断该数是否是Fibonacci序列中的数
{
    public static void main(String[] args)throws IOException
    {
        int a=0,b=1,n,num;
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入一个正整数");
        str=buf.readLine();         //从键盘读取字符串
        num=Integer.parseInt(str);  //将字符转换成数
        while(b<num)
        {
            n=a+b;
            a=b;
            b=n;
        }
        if(num ==b)
            System.out.println(num+"是Fibonacci数");
        else
            System.out.println(num+"不是Fibonacci数");
    }

}
