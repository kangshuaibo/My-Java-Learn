package App9_4;
//求命令行方式输入整数n的阶乘n！，并捕获可能出现的异常
public class App9_4
{
    public static double multi(int n)   //注意：该方法没有对异常捕获，则调用该方法的 方法需要对异常进行捕获
    {
        if(n<0)
            throw new IllegalArgumentException("求负数阶乘异常");//(**)抛出无效参数异常，此方法并没有捕获

        double s=1;
        for(int i=1;i<=n;i++)
            s=s*i;
        return s;
    }

    public static void main(String[] args)
    {
        try
        {
            int m=Integer.parseInt(args[0]);        //(*)可能抛出两个异常：没参数or非整数
            System.out.println(m+"!="+multi(m));//调用计算阶乘的方法multi()
        }
        catch (ArrayIndexOutOfBoundsException e)    //(*)数组下标越界异常 没有参数args[0]
        {
            System.out.println("命令行中没有提供参数");
        }
        catch (NumberFormatException e)             //(*)产生数据格式异常 非整数
        {
            System.out.println("应输入一个「整数」");
        }
        catch (IllegalArgumentException e)  //（**)对无效参数异常进行捕获，主方法调用并捕获
        {
            System.out.println("出现的异常是："+e.toString());
        }
        finally {
            System.out.println("程序运行结束");
        }
    }
}

/*命令行运行时需要注意
法一
运行时需要在terminal中输入 java App9_4.App9_4  -5    //-5为参数
即 "java 包名.类名 参数" 的命令行格式

法二
在idea中右上角 Edit Configurations 配置proguams agguments 即在其中填入参数即可（如-5）
*/

