import java.util.*;
public class Exercises5_6   //十五个红球 十五个绿球排成一圈。从第1个求开始数，当数到第13个球时就拿出此球。然后从下一个球开始数，当再数到13时取出此球。直到剩余15个为止。问怎样才能使每次取出的都是红球
{
    public static void main(String[] args)
    {
        int[] a= new int[31];
        int i,j,k=1;
        for(i=1;i<=15;i++)  //直到剩15个
        {
            for (j=1;j<=13;j++,k++) //每13个一拿
            {
                if(k>30)     //当下标比圈大时
                    k=1;        //回到第一个
                while (a[k]!=0) //不是绿球
                    if(++k>30)  //当k的下一个比圈大时
                        k=1;    //回到第一个
            }
            a[k-1]=1;   //那就是红球置1
        }
        for(i=1;i<=30;i++)
            System.out.print(" "+a[i]);
        System.out.println("\n  1:表示红球，0：表示绿球");
    }
}
