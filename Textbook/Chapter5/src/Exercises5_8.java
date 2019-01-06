import java.util.Scanner;

public class Exercises5_8   //从键盘输入 一个字符串 和 子串开始位置与长度 截取该字符串的子串并输出
{
    public static void main(String[] args)
    {
        String str,substr="";
        int begin,len;
        Scanner buf = new Scanner(System.in);
        System.out.print("输入字符串：");
        str=buf.nextLine();

        System.out.print("输入字符串开始位置：");
        begin=buf.nextInt();

        System.out.println("输入截取长度：");
        len= buf.nextInt();

        if((begin-1+len)<=str.length())
        {
            substr=str.substring(begin-1,begin+len-1);
            System.out.println("输入的字符串是："+str);
            System.out.println("截取的子串是："+substr);
        }
        else
            System.out.print("输入数据错误");
    }
}
