import java.util.*;
public class Exercises5_1   //从键盘输入n个数 输出这些数中大于其平均值的数
{
    public static void main(String[] args)
    {
        int n;
        double sum=0,average;

        Scanner reader = new Scanner(System.in);
        System.out.print("请输入个数n=");
        n=reader.nextInt(); //从读取键盘个数n

        int[] a=new int[n];
        if(n>0)
        {   //循环输入到n
            for(int i=0;i<n;i++)
            {
                System.out.print("请输入第"+(i+1)+"个数：");
                a[i]=reader.nextInt();  //读取键盘数据
                sum=sum+a[i];
            }
            //算平局数
            average=sum/n;
            System.out.println("数据的平局数是："+average);
            //输出大于平局的数
            System.out.println("大于平局的数据有：");
            for(int i=0;i<n;i++)
            {
                if(a[i]>average)
                {
                    System.out.print(a[i]+"、");
                }
            }
        }
        else
        {
            System.out.print("没有数据");
        }
    }
}
