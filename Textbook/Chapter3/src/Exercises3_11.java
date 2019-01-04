import java.util.*;
public class Exercises3_11  //从键盘输入浮点数 然后将该浮点数的整数部分输出
{
    public static void main(String[] args)
    {
        double d;
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入一个实数");
        d=reader.nextDouble();
        System.out.println(d+"整数部分为："+(long)d);
    }
}
