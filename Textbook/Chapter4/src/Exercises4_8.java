import java.util.*;
public class Exercises4_8    //输出一个整数各个位数之和
{
    public static void main(String[] args)
    {
        int n,s,sum=0;
        Scanner buf= new Scanner(System.in);
        System.out.print("请输入n=");
        n=buf.nextInt();
        while (n>0)
        {
            s=n%10; //求这个位数
            n=(n-s)/10;  //减去这个位数为下一个位数
            sum=sum+s;  //各个位数之和
        }
        System.out.println("sum="+sum);
    }
}
