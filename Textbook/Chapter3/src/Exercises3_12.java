import java.util.*;
public class Exercises3_12  //从键盘输入连个数 计算相除的结果并输出
{
    public static void main(String[] args)
    {
        int num1;
        double num2;

        Scanner reader = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        num1=reader.nextInt();

        System.out.println("请输入第二个数：");
        num2=reader.nextDouble();

        System.out.println(num1+"/"+num2+"="+(num1/num2));


    }


}
