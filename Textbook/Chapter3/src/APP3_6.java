import java.util.*;
public class APP3_6 //方法二 利用Scanner类从键盘输入多个数据
{
    public static void main(String[] args)
    {
        int num1;
        double num2;
        Scanner reader = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        num1 = reader.nextInt();

        System.out.println("请输入第二个数：");
        num2=reader.nextDouble();

        System.out.println(num1+"*"+num2+"="+((float)num1*num2));
    }

}
