package Exercises11_8;
//假设某家银行可接收顾客的存款，每次进行一次存款，便可计算出存款的总额。
// 现有两名顾客，每人分三次、每次存入100元。试编程来模拟顾客的存款操作

class Bank
{//银行存款类
    private static int sum = 0;
    public synchronized static void add(int n)
    {
        int tmp= sum;
        tmp = tmp+n;    //用于缓存sleep
        try{
            Thread.sleep((int)(1000*Math.random()));
        }catch (InterruptedException e){}
        sum = tmp;
        System.out.println("Sum="+sum);

    }
}

//顾客存款类
class Customer extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)//每人存3次
            Bank.add(100);
    }
}

//主类
public class Exerrcises11_8
{
    public static void main(String[] args)
    {
        Customer c1=new Customer();//两名顾客
        Customer c2=new Customer();
        c1.start();
        c2.start();
    }
}
