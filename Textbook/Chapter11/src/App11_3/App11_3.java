package App11_3;

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
//在多线程中join()方法的使用
public class App11_3
{
    public static void main(String[] args)
    {
        MyThread you = new MyThread("你");
        MyThread she = new MyThread("她");

        you.start();
        try{
            you.join(); //调用join()方法，其他线程会等到该线程结束后才开始执行
        }catch (InterruptedException e){}

        she.start();
        try {
            she.join();
        }catch (InterruptedException e){}
        System.out.println("主方法main()运行结束");
    }
}
