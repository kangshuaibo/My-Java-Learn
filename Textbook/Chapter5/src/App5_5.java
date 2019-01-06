public class App5_5 //声明三维数组并赋初值 然后输出该数组的各个元素 并计算各个元素之和
{
    public static void main(String[] args)
    {
        int i,j,k,sum=0;
        int[][][] a= {  {{1,2},{3,4}},
                        {{5,6},{7,8}} };
        for(i=0;i<a.length;i++)
            for(j=0;j<a[i].length;j++)
                for(k=0;k<a[i][j].length;k++)
                {
                    System.out.println("a["+i+"]["+j+"]["+k+"]="+a[i][j][k]);
                    sum+=a[i][j][k];
                }
        System.out.println("sum="+sum);
    }

}
