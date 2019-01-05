public class App5_4 //计算并输出杨辉三角形
{
    public static void main(String[] args)
    {
        int i,j;
        int leave =7;
        int[][] aiYong = new int[leave][];

        System.out.println("杨辉三角形");
        for(i=0;i<aiYong.length;i++)
            aiYong[i]= new int[i+1];    //定义二维数组的第i行有i+1列
        aiYong[0][0]=1;
        for(i=1;i<aiYong.length;i++)
        {
            aiYong[i][0]=1; //第一列置1
            for(j=1;j<aiYong[i].length-1;j++)   //如第三行 一行有三个元素
                aiYong[i][j]=aiYong[i-1][j-1]+aiYong[i-1][j];//每一个元素是    这个元素的上一行 和   上一行的左一个 之和
            aiYong[i][ aiYong[i].length-1 ]=1;  //这一行末尾置1
        }
        //打印杨辉三角形
        for(int[] row : aiYong )    //数组aiyong的每一个数组元素即一排row数组 （行）
        {
            for(int col : row)      //数组row的每一个元素（列）
                System.out.print(col+ " ");
            System.out.println();
        }
    }
}
