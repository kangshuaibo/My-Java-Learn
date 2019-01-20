package App11_5;
//用Runnable接口程序来模拟航班售票系统，实现3个售票窗口发售某次航班的10张机票，一个售票窗口用一个线程来表示
class ThreadSale implements Runnable    //创建Runnable接口类，模拟航班售票窗口
{
    private int tickets = 10;
    public void run()
    {
        while (true)
        {
            if(tickets>0)
                System.out.println(Thread.currentThread().getName()+ "售机票第"+ tickets-- +"号");
            else
                System.exit(0);
        }
    }
}
public class App11_5
{
    public static void main(String[] args)
    {
        ThreadSale t= new ThreadSale(); //只创建一个实现Runnable接口的售票类对象t
        Thread t1 = new Thread(t,"第1售票窗口");
        Thread t2 = new Thread(t,"第2售票窗口");
        Thread t3 = new Thread(t,"第3售票窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
