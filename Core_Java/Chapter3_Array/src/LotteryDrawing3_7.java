//数组排序
import java.lang.reflect.Array;
import java.util.*;

public class LotteryDrawing3_7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("要取几个数字？");
        int k = in.nextInt();

        System.out.print("一共有多少数字？");
        int n = in.nextInt();

        int[] numbers = new int[n]; //存放总数字n个 左边为声明 右边为初始化
        for (int i=0;i<numbers.length;i++)
        {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];  //存放结果k个数
        for (int i = 0;i<result.length;i++)
        {
            int r = (int)(Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];  //放最后一个元素
            n--;
        }
        Arrays.sort(result);    //调用Arrays类的sort方法
        System.out.print("结果为：");
        for(int r:result)
            System.out.print(r + " ");

        System.out.print("\nArray类的toString方法：");
        System.out.print(Arrays.toString(result));
    }
}
