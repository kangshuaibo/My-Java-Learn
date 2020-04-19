public class CompoundInterest3_8
{
    public static void main(String[] args)
    {
        final double STARTRATE = 10;    //final关键字 变量只能被赋值一次
        final int NRATES = 6;
        final int NYEARS = 10;

        //设置利率
        double[] interestRate = new double[NRATES];
        for (int j=0; j<interestRate.length;j++)
            interestRate[j] = (STARTRATE+j)/100.0;  //汇率为 10 11 12 13

        //设置初始第一行结余10000
        double[][] balances = new double[NYEARS][NRATES];
        for(int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        //计算接下来的年份
        for(int i = 1; i < balances.length ;i++)
        {
            for(int j = 0;j < balances[i].length; j++)
            {
                double oldBalance = balances[i-1][j];

                //计算interest
                double interest = oldBalance * interestRate[j];

                balances[i][j] = interest + oldBalance;
            }
        }

        //打印一行的利率
        for(int j = 0; j < interestRate.length; j++)
        {
            System.out.printf("%9.0f%%",100*interestRate[j]);
        }

        System.out.println();

        //打印结余表格
        for (double[] row : balances)
        {
            for (double b : row)
                System.out.printf("%10.2f",b);

            System.out.println();
        }

    }

}
