import java.util.*;

/*如果必须从1 ~ 50 之间的数字中取6 个数字来抽奖， 那么会有(50 x 49 x 48 x 47 x 46 x 45)/
        (1 x 2 x 3 x 4 x 5 x 6) 种可能的结果*/
public class LotteryOdds
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k ;i++)
            lotteryOdds = lotteryOdds * (n - i + 1) /i;

        System.out.println("Your odds are 1 in " + lotteryOdds + ".Good luck!");
    }
}
