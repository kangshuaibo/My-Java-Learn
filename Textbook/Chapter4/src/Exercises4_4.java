import java.util.*;
public class Exercises4_4   //再键盘中输入n 计算1！+2！+3！+...+n!的结果
{
    public static void main(String[] args)
    {
        int n,s=1,sum=0;
        Scanner buf =new Scanner(System.in);
        do{
            System.out.print("请输入n=");
            n=buf.nextInt();
        }while(n<=0);

        for(int i=1;i<=n;i++)
        {
            s=s*i;
            sum=sum+s;
        }
        System.out.print("sum="+sum);
    }

}
