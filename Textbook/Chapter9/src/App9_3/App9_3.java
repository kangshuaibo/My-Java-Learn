package App9_3;
//使用throw语句在方法内抛出异常，并在同一方法内进行相应的异常处理
public class App9_3
{
   public static void main(String[] args)
   {
       int a= 5,b=0;
       try{
           if(b==0)
               throw new ArithmeticException();//抛出异常
           else
               System.out.println(a+"/"+b+"="+a/b); //若不抛出异常，则运行此行
       }
       catch (ArithmeticException e)
       {
           System.out.println("异常："+e+"被抛出了！");
           e.printStackTrace();//输出当前异常对象的堆栈使用轨迹
       }
   }
}
