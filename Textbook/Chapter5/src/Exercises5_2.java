import java.util.*;
public class Exercises5_2   //从键盘输入n个数，求这n个数中的 最大数 与 最小数 并输出
{
    public static void main(String[] args)
    {
        int n,max,min;
        Scanner reader= new Scanner(System.in);
        System.out.print("请输入个数n");
        n=reader.nextInt(); //输入个数n

        int[] a=new int[n];
        if(n>0)
        {   //输入数据
            for(int i=0;i<n;i++)
            {
                System.out.print("请输入第"+(i+1)+"个数");
                a[i]=reader.nextInt();
            }
            //找出最大最小
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(a[i]>max)
                    max=a[i];
                if(a[i]<min)
                    min=a[i];
            }
            System.out.println("最大数Max="+max);
            System.out.println("最小数Min="+min);
        }
        else
        {
            System.out.println("没有数据");
        }
    }
}
