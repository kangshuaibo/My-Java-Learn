package App11_8;

import java.io.IOException;

//用两个线程模拟存票售票过程。但要求每存入一张票，就出售一张票，出售后再存入，直到售完为止
public class App11_8
{
    public static void main(String[] args)
    {
        Tickets t = new Tickets(10);//新建票类对象t，总票数作为参数
        new Producer(t).start();    //创建存票线程类
        new Consumer(t).start();    //创建售票线程类
    }
}

//票类
class Tickets
{
    protected int size;//总票数
    int number = 0; //票号
    boolean available = false;//表示但前是否有票可售

    //构造方法 传入总票数参数
    public Tickets(int size)
    {
        this.size= size ;
    }

    //同步方法 实现存票功能
    public synchronized void put()
    {
        if(available)
            try{
                wait(); //如果还有存票待售，则存票线程等待
            }catch (Exception e){}
        System.out.println("存入第【"+(++number)+"】号票");
            available = true;
            notify();   //存票后唤醒 售票 线程开始存票
    }

    //同步方法 实现售票功能
    public synchronized void sell()
    {
        if(!available)  //如果没有存票则售票线程等待
            try {
                wait();
            }catch (Exception e){}
        System.out.println("出售第【"+(number)+"】号票");
            available = false;
            notify();   //售票后唤醒 存票 线程开始存票

        //在售完最后一张票后 设置一个结束标志
        if(number == size)
            number = size + 1;//number > size表示售票结束
    }
}

//存票线程类
class Producer extends Thread
{
    Tickets t = null;
    public Producer(Tickets t)  //构造方法，使两线程共享票类对象
    {
        this.t = t;
    }
    public void run()
    {
        while (t.number<t.size)
            t.put();
    }
}

//售票线程类
class Consumer extends Thread
{
    Tickets t = null;
    public Consumer(Tickets t)
    {
        this.t = t;
    }
    public void run()
    {
        while (t.number<=t.size)
            t.sell();
    }
}
