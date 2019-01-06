import java.util.*;
public class Exercises5_3   //求三阶方阵对角线元素之和
{
    public static void main(String[] args)
    {
        Scanner buf = new Scanner(System.in);
        int[][] nums = new int[3][3];
        int i,j,sum=0;
        System.out.println("输入一个三阶方阵");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                nums[i][j]=buf.nextInt();
        //输出和
        for(i=0;i<3;i++)
            sum=sum+nums[i][i];
        System.out.print("对角线的和是："+sum);
    }
}
