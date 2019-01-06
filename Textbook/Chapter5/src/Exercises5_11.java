import java.io.*;
public class Exercises5_11  //将用户从键盘输入的每行数据都显示输出 直到输入exit字符串
{
    public static void main(String[] args)throws IOException
    {
        String str;
        BufferedReader buf;
        buf= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入字符串，按exit推出");
        do{
            str=buf.readLine(); //输入字符串
            System.out.println(str);
        }while (!str.equals("exit"));
    }
}
