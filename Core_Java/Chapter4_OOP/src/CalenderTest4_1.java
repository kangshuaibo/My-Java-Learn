import java.time.*;

public class CalenderTest4_1
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();  //今天的日期
        int month = date.getMonthValue();
        int today = date.getDayOfMonth(); //这个月的第几天

        date = date.minusDays(today - 1);   //设置为这个月的第一天 今天的日期减去这个月第几天
        DayOfWeek weekday = date.getDayOfWeek();    //得到星期monday sunday等等
        int value = weekday.getValue();     //得到值 monday=1

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value ;i++) //打印一行缩进 比如1号为Sunday=7 前六个就空出来
            System.out.print("    ");

        while ( date.getMonthValue() == month)  //遍历这个月中的每一天 直到不是这个月
        {
            System.out.printf("%3d", date.getDayOfMonth()); //date已经初始化为第一天
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);    //从第一天开始 每次加一天
            if(date.getDayOfWeek().getValue() == 1)
                System.out.println(" ");
        }
        //if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
