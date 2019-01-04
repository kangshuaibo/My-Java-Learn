import java.util.*;
public class Exercises3_13  //从键盘输入圆柱体的底半径r和高h，然后计算其体积并输出。
{
    public static void main(String[] args)
    {
        double r,h,pi=3.14;
        Scanner reader= new Scanner(System.in);

        System.out.println("请输入半径r");
        r=reader.nextDouble();

        System.out.println("请输入高h");
        h=reader.nextDouble();

        System.out.println("圆柱体体积="+(pi*h*r*r));
    }

}
