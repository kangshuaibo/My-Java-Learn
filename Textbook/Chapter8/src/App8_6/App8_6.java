package App8_6;
//父类中被声明为final的成员在子类中可被继承 但不能被覆盖
class AAA
{
    static final double PI=3.14;
    public final void show()    //最终方法 不能被覆盖
    {
        System.out.println("pi="+PI);
    }
}
class BBB extends AAA
{
    private int num= 100;
  //  public void show()  //编译错误
    {
        System.out.println("num+"+num);
    }

}

public class App8_6
{
    public static void main()
    {
        BBB ex = new BBB();
        ex.show();
    }
}
