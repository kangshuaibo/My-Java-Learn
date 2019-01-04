public class Exercises4_10  //3000米的绳子 每天减去一半 问需要几天绳子长度会短于5米
{
    public static void main(String[] args)
    {
        float length=3000;
        int dayCount=0;
        do {
            length=length/2;
            dayCount++;
        }while(length>=5);
        System.out.println("需要："+dayCount+"天时间");
    }

}
