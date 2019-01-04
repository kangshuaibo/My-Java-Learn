import java.util.*;
public class Exercises4_9_2
{
    public static void main(String[] args)
    {
        double x;
        String zs,xs,s;
        System.out.println("请输入一个整数：");
        Scanner reader= new Scanner(System.in);
        x=reader.nextDouble();
        s=" "+x;    //数字转化为字符串

        int i;
        i=s.indexOf('.');   //返回首次出现的位置
        zs=s.substring(0,i);
        xs=s.substring(i+1);
        System.out.println("整数部分是："+zs);
        System.out.println("小数部分是：0."+xs);
    }
}
