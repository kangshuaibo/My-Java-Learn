package App9_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//将输入的字符串小写转换成大写 若没有输入数据给出提示信息
public class App9_6
{
    public static void main(String[] args)
    {
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            try
            {
                System.out.print("请输入字符串");
                str = buf.readLine();   //从键盘输入数据传给str
                if (str.length()>0)
                    break;
                else
                    throw new IOException();    //抛出输入输出异常
            }
            catch (IOException e)
            {
                System.out.println("必须输入字符串！！");
                continue;
            }
        }
        String s=str.toUpperCase(); //转换大写赋值给变量s
        System.out.println("转换后的字符串为："+s);
    }
}
