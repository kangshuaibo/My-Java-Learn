public class App5_3_2   //约瑟夫环2
{
    public static void  main(String[] args)
    {
        final int N=13,S=3,M=5; //N为总人数 从第S个人开始报数 报数为M的出圈子
        int[] p=new int[N];     //数组p用于标记已出圈的人
        int[] q=new int[N];     //数组q存放出队序列

        int i,j,k,n=0;
        k=S-2;  //从1开始 数出圈人的下标
        for(i=1;i<=N;i++)
        {
            for (j=1;j<=M;j++)  //从1到M报数 计算出圈人的下标
            {
                if(k==N-1)      //当出圈人的下标达到末尾时 出圈人的下标从0开始 否则加1
                    k=0;
                else
                    k++;


                if(p[k]==1) //若p[k]等于1，说明下标为k的人已出圈
                    j--;    //由于跳过已经出圈的人，所以j要减1，以保证每次过M个人
            }
            p[k]=1; //下标为k的数组元素置1 表示其出圈
            q[n++]=k+1; //下标为k的人的编号为k+1 逐个(n++)存入出队序列q中
        }
        //循环输出
        System.out.println("出队顺序为：");
        for(i=0;i<N;i++)
        {
            System.out.print(q[i]+"  ");
        }
    }
}
