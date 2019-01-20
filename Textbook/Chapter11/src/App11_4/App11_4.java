package App11_4;
//用Thread子类程序来模拟航班售票系统，实现3个售票窗口发售某次航班的10张机票，一个售票窗口用一个线程来表示（错解）
class ThreadSale extends Thread
{
    private int tickets = 10;   //私有变量tickets代表机票数 是共享数据
    public void run()
    {
        while (true)
        {
            if(tickets>0)   //如果有票可售
                System.out.println(getName()+"售机票第"+ tickets-- +"号");
            else
            {
               System.out.println("就是你");
                System.exit(0);
            }
        }
    }
}
public class App11_4    //在创建一个类 在它的main()方法中创建并启动3个线程对象
{
    public static void main(String[] args)
    {
        ThreadSale t1 = new ThreadSale(); //创建三个Thread类的子类的对象
        ThreadSale t2 = new ThreadSale();
        ThreadSale t3 = new ThreadSale();
        t1.start(); //分别用这三个对象调用自己的线程
        t2.start();
        t3.start();
    }

}
