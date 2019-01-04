import java.util.*;
public class APP3_7 //利用Scanner类，使用next()和nextLine()方法接受从键盘输入的字符串
{
    public static void main(String[] args)
    {
        String s1,s2;
        Scanner reader = new Scanner(System.in);

        System.out.println("请输入第一个数据：");
        s1=reader.nextLine();   //键盘输入的内容作为字符串形数据

        System.out.println("请输入第二个数据：");
        s2=reader.next();   //按enter后 next()方法将 有效输入前的 回车和换行符号去掉 之后遇到的空格等才是结束符

        System.out.println("输入的是"+s1+"和"+s2);
    }
}
