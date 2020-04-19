public class LotteryArray3_9
{
    public static void main(String[] args)
    {
        final int NMAX = 10;

        //分配三角形数组
        int[][] odds = new int[NMAX+1][]; //java数组的子数组可以不指定长度 先分配行
        for(int n=0; n <= NMAX ; n++)  //再分配子数组
            odds[n] = new int[n+1];     //每行元素递增

        //填充元素
        for(int n = 0; n<odds.length ; n++)
            for(int k = 0; k < odds[n].length; k++)
            {
                //每个元素分配：n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                int lotteryOdds = 1;
                for (int i=1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n-i+1)/i;

                odds[n][k] = lotteryOdds;
                //System.out.print(lotteryOdds);
            }

        //print
        for( int[] row : odds)
        {
            for(int odd : row)
                System.out.printf("%4d",odd);
            System.out.println();
        }
    }
}
