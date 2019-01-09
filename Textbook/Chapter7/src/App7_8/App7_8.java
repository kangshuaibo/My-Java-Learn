package App7_8;
//将圆柱体类Cylinder里的变量pi和num声明为静态变量：（静态变量类似于全局变量 存在类的公共区 对于所有对象是共有的，即修改一个就是改公共的）
class Cylinder
{
    private static int num = 0; //静态变量是公共的 不属于任何对象 。任何对象都能修改他，统计创建了几个对象
    private static double pi=3.14;//静态变量是公共的 都可以访问并修改
    private double radius;
    private int height;
    public Cylinder(double r,int h) //定义两个有参数的构造方法
    {
        radius=r;
        height=h;
        num++;  //当构造方法Cylinder被调用时，num便加1
    }
    public void count()
    {
        System.out.print("创建了"+num+"个对象");
    }
    double area()
    {
        return pi*radius*radius;
    }
    double volume()
    {
        return area()*height;
    }
}
public class App7_8
{
    public static void main(String[] args)
    {
        Cylinder volu1 = new Cylinder(2.5,5);   //创造了对象，构造方法被调用，num加一
        volu1.count();      //输出此时的num值查看
        System.out.println("圆柱1的体积="+volu1.volume());

        Cylinder volu2 = new Cylinder(1.0,2);//又创建了对象，构造方法又被调用 ，num+1
        volu1.count();
        System.out.println("圆柱2的体积="+volu2.volume());
    }
}
