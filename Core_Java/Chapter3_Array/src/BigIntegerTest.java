import java.math.*;
import java.util.*;
//并从490 个可能的数值中抽取60 个
public class BigIntegerTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("共有多少个数字？");
        int k = in.nextInt();

        System.out.print("要抽取多少？");
        int n = in.nextInt();

        System.out.print("抽奖的概率是：");
        BigInteger lotterOdds =  BigInteger.valueOf(1);


        for (int i = 1; i <= k; i++)
        {
            lotterOdds = lotterOdds.multiply(BigInteger.valueOf(k-i+1).divide(BigInteger.valueOf(i)));
        }
        System.out.println("Your odds are 1 in " + lotterOdds + ".Good luck!");
    }
}
