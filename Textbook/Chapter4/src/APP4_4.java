import java.util.*;
public class APP4_4 //从键盘上输入一个月份 然后判断该月份的天数
{
    public static void main(String[] args)
    {
        int month,days;
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入月份");
        month=reader.nextInt();
        switch(month)
        {
            case 2:
                days=28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;

                default:days=31;
        }
        System.out.println(month+"月份为"+days+"天");
    }
}
