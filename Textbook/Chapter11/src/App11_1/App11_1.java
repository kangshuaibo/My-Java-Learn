package App11_1;
//利用Thread类的子类来创建线程
//Thread类位于java.lang包中 不需要导入包
class MyThread extends Thread   //创建Thread的子类
{
    private String who;
    public MyThread(String str) //构造方法 用于设置成员变量who
    {
        who = str;
    }
    public void run()   //覆盖Thread类里面的run()方法
    {
        for(int i=0;i<5;i++)//一个线程睡眠5次 睡眠时另一个线程抢占
        {
            try
            {   //sleep方法必须写在try-catch块内
                sleep((int)(1500*Math.random()));   //用来控制线程的睡眠时间
            }
            catch (InterruptedException e){}
            System.out.println(who+"正在运行！！");
        }
    }

}
public class App11_1
{
   public static void main(String[] args)
   {
       MyThread you = new MyThread("你");
       MyThread she = new MyThread("她");
       you.start(); //注意调用的是start()方法而不是run方法 执行run()方法中途会睡眠
       she.start(); //注意调用的是start()方法而不是run方法
       System.out.println("主方法main()运行结束");//不需要激活也没有sleep()方法 故会先执行先完毕
   }
}
