import java.awt.desktop.SystemSleepEvent;
import java.util.*;
public class Exercises5_4 //找出4x5矩阵中的最小和最大元素，并分别输出其所在的行号和列号
{
   public static void main(String[] args)
   {
       Scanner buf = new Scanner(System.in);
       int[][] nums = new int[4][5];
       int i=0,j=0,min,max,row1=0,row2=0,col1=0,col2=0;
       System.out.println("输出一个四行五列的矩阵：");
       System.out.println();
       //输入矩阵各个元素
       for(i=0;i<4;i++)
       {
           for(j=0;j<5;j++)
               nums[i][j]=buf.nextInt();
       }
       //输出这个方阵
       for(i=0;i<4;i++)
       {
           for(j=0;j<5;j++)
               System.out.print(" "+nums[i][j]);
           System.out.println();
       }
        //找最大最小值
       min=Integer.MAX_VALUE;
       max=Integer.MIN_VALUE;
       for (i=0;i<4;i++)
           for(j=0;j<5;j++)
           {
               if (nums[i][j] < min)
               {
                   min = nums[i][j];
                   row1 = i;
                   col1 = j;
               }
               if(nums[i][j]>max)
               {
                   max=nums[i][j];
                   row2 = i;
                   col2 = j;
               }
           }
       System.out.print("最小数是："+min);
       System.out.println(",在["+(row1+1)+"]行，["+(col1+1)+"]列");
       System.out.print("最大数是："+max);
       System.out.println(",在["+(row2+1)+"]行，["+(col2+1)+"]列");


   }
}
