package App11_6;
//设计一个模拟用户从银行取款的应用程序。设某银行账户存款额的初值是2000圆，用线程模拟两个用户分别从银行取款的情况。
// 两个用户分4次分别从银行的同一账户取款，每次取100圆。
class Mbank
{
    private static int sum = 2000;  //模拟初始存款额为2000
    public static void take(int k)
    {
        int temp = sum;
        temp -= k;   //变量temp中保存的是每个线程处理的值
        try{//模拟网络阻塞 之后再来显示金额
            Thread.sleep((int)(1000*Math.random()));
        }catch (InterruptedException e){}
        sum = temp;
        System.out.println("sum="+sum);

    }
}
class Customer extends Thread   //模拟用户取款的线程
{
    public void run()   //取钱4次
    {
        for(int i=1;i<=4;i++)
            Mbank.take(100);
    }
}
public class App11_6    //调用线程的主类
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        c1.start();
        c2.start();
    }
}
