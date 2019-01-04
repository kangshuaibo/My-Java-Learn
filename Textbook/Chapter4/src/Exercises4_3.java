import java.util.*;
public class Exercises4_3    //输出1～100所有既可以被3 整除，又可以被7整除的数
{
    public static void main(String[] args) {
        int x;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("请输入1～100的数");
            x = reader.nextInt();
        } while (x < 0 || x > 100);
        if (x % 3 == 0 && x % 7 == 0)
            System.out.println("输入的数是" + x + "满足要求");
        else
            System.out.println("输入的数是" + x + "不满足要求");
    }
}

