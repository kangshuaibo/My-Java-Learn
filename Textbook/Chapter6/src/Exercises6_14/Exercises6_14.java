package Exercises6_14;

import java.util.Scanner;

public class Exercises6_14  //以m行n列二维数组 为参数进行方法调用。分别计算二维数组各列元素之和，返回并输出所计算结果
{
    public static void main(String[] args)
    {
        Scanner reader= new Scanner(System.in);
        int i,j;
        int m,n;
        System.out.print("输入行数M=");
        m=reader.nextInt();

        System.out.print("输入列数N=");
        n=reader.nextInt();

        int[][] a=new int[m][n];
        int[] col=new int[n];   //存放二维数组各个列和的一维数组

        System.out.print("请输入【"+m+"】*【"+n+"】个数据");
        for(i=0;i<m;i++)
            for (j=0;j<n;j++)
                a[i][j]=reader.nextInt();

        SumNum sumnum = new SumNum();
        col=sumnum.colnum(a);       //summun对象调用colnum方法 传递二维数组。返回一维数组 存放到 col中
        for(i=0;i<col.length;i++)
            System.out.println("第"+(i+1)+"列数的和="+col[i]);



    }
}

class SumNum
{
    int[] colnum(int[][] array)     //计算二维数组各列元素之和 返回一个一维数组
    {
        int [] temp = new int [array[0].length];
        for(int j=0;j<array[0].length;j++)
            for(int i=0;i<array.length;i++)
                temp[j]+=array[i][j];

        return temp;
    }
}
