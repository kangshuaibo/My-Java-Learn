import java.util.*;
public class Exercises4_9   //输入一个浮点数 将整数部分和小数部分分别输出
{
    public static void main(String[] args)
    {
        double num1,num2;
        int n=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入一个实数：");
        num1=reader.nextDouble();
        num2=num1;
        while (true)    //num2整个自减 统计次数 一直减到0 次数就是整数部分了
        {
            num2--;
            if(num2<0)
                break;
            n++;
        }
        System.out.println("整数部分是："+n+"小数部分是"+(num1-n));
    }
}
