package App10_4;
//键盘输入字符串 显示在屏幕上 并显示System.in和System.out
import java.io.*;
public class App10_4
{
    public static void main(String[] atgs)
    {
        try
        {
            byte[] b= new byte[128];    //设置输入缓冲区
            System.out.print("请输入字符：");
            int count = System.in.read(b);  //读取标准输入流，将回车符和换行符也存放到b数组中
            System.out.println("输入的是");
            for(int i=0;i<count;i++)
                System.out.print(b[i]+" "); //输入数组b中元素的AScII值
            System.out.println();

            for(int i=0;i<count;i++)    //不显示回车符和换行符
                System.out.println((char)b[i]+"  ");
            System.out.println();

            System.out.println("输入的字符个数为"+count);

            Class InClass = System.in.getClass();
            Class OutClass = System.out.getClass();
            System.out.println("in所在的类是："+InClass.toString());
            System.out.println("out所在的类是："+OutClass.toString());

        }
        catch (IOException e){}
    }
}
