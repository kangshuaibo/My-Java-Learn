import java.io.*;

public class APP3_5 //从键盘输入多个数据
{
    public static void main(String[] args)throws IOException
    {
        int num1,num2;
        String str1,str2;

        InputStreamReader in;
        in =new InputStreamReader(System.in);

        BufferedReader buf;
        buf = new BufferedReader(in);

        System.out.println("请输入第一个数：");
        str1=buf.readLine();            //通过buf对象调用readline方法 读取输入的字符串
        num1=Integer.parseInt(str1);    //将字符串强制类型转换为整形数字

        System.out.println("请输入第二个数：");
        str2= buf.readLine();
        num2=Integer.parseInt(str2);

        System.out.println(num1+"*"+num2+"="+(num1*num2));

    }

}
