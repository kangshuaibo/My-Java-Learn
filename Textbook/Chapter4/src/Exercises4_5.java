import java.util.*;
public class Exercises4_5   //计算1-1/2！+1/3！-...(-1)^n-1 1/n!
{
    public static void main(String[] args)
    {
        int n,i=1;
        double s=1,sum=0;

        Scanner buf= new Scanner(System.in);
        do{
            System.out.print("输入n的值");
            n=buf.nextInt();
        }while(n<=0);

        do{
            sum=sum+s;
            i++;
            s=-s/i;
        }while (i<=n);
        System.out.print("sum="+sum);

    }
}
