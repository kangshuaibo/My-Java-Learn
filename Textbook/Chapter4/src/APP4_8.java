import java.util.*;
public class APP4_8 //从键盘输入正整数n然后计算1+2+3+4+5+。。+n的结果并输出
{
    public static void main(String[] args)
    {
        int n,i=1,sum=0;
        Scanner buf = new Scanner(System.in);
        do{
            System.out.print("输入正整数");
            n=buf.nextInt();
        }while(n<=0);       //输入的数据必须大于0 否则要一直输入

        while (i<=n)
            sum+=i++;
        System.out.println("1+2+3+...+"+n+"="+sum);
    }
}
