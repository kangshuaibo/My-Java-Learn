import java.util.*;
public class Exercises4_7   //判断完数
{
    public static void main(String[] args)
    {
        int i,a,b=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("输入非数值推出！！，否则输入数");
        while (reader.hasNextInt()) //判断是不是数
        {
            b=0;
            a=reader.nextInt(); //输入数据保存到a
            for(i=1;i<=a/2;i++)
                if(a%i==0)  //是因子
                    b+=i;//因子求和
            if(a==b)
                System.out.println("\n您输入的数【"+a+"】是完全数");
            else
                System.out.println("\n您输入的数【"+a+"】是不完全数");
            System.out.println("\n输入非数值推出！！，否则输入数");
        }
    }

}
