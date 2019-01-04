import java.util.Scanner;

public class APP4_10    //已知S=N！，其中N为正整数。从键盘上任意输入一个大于1的整数M，求满足S<M时最大S及此时的N，并输出S和N的值
{
    public static void main(String[] args)
    {
        int n=1,s=1,m;
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("请输入大于1的整数M");
            m=reader.nextInt();
        }while (m<=1);  //m<=1要重新输入 直到m>1为止

        while(s<m)  //判断n!<m是否成立
        {
            s*=n;   //计算s=n！
            n++;
        }
        System.out.println("s="+s/(n-1)+"    n="+(n-2));
    }
}
