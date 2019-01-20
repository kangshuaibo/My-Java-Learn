package App11_2;
//利用Runnable接口开创建线程
class MyThread implements Runnable  //Runnable接口提供一个run()方法声明
{
    private String who;
    public MyThread(String str) //构造方法
    {
        who = str;
    }
    public void run()   //覆盖run()方法
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep((int)(1000*Math.random()));    //方法前加上前缀
            }
            catch (InterruptedException e)
            {
               // System.out.println(e.toString());
            }
            System.out.println(who+"正在运行！！");
        }
    }
}
public class App11_2
{
    public static void main(String[] args)
    {
        MyThread you = new MyThread("你");
        MyThread she = new MyThread("她");
        Thread t1 = new Thread(you);    //产生Thread类的对象
        Thread t2 = new Thread(she);
        t1.start();//用对象激活线程
        t2.start();

    }
}
