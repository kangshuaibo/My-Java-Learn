package App11_7;
//修改例11_6,用线程同步的方法设计用户从银行取款的应用程序
class Mbank //模拟银行账户类
{
    private static int sum = 2000;
    public synchronized static void take(int k) //限定take()为同步方法
    {
        int temp = sum;
        temp -= k;
        try{
            Thread.sleep((int)(1000*Math.random()));
        }catch (InterruptedException e){}
        sum = temp;
        System.out.println("sum="+sum);
    }
}
class Customer extends Thread   //模拟用户取款线程类
{
    public void run()
    {
        for(int i=1;i<=4;i++)
            Mbank.take(100);
    }
}
public class App11_7
{
    public static  void main(String[] args) //调用线程主类
    {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        c1.start();
        c2.start();
    }
}
