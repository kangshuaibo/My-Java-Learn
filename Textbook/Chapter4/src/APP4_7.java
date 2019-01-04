import java.util.*;
public class APP4_7
{   //利用hasNextXXX()和nextXXX()方法来配合使用完成键盘输入 用户再键盘上输入若干个数 每输入一个数按enter确认 ，最后输入非数字字符结束输入。计算和
    public static void main(String[] args)
    {
        double sum=0;
        int n=0;
        System.out.println("请输入多个数，每输入一个数后按enter确认");
        System.out.println("最后输入非数字字符结束输入");
        Scanner reader =new Scanner(System.in);

        while (reader.hasNextDouble())  //判断输入的数中是否有浮点数
        {
            double x=reader.nextDouble();   //读取并转换
            sum=sum+x;
            n++;


        }
        System.out.print("共输入了"+n+"个数，其和为："+sum);

    }
}
