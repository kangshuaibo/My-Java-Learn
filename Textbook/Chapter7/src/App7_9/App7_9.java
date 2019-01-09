package App7_9;
//利用圆柱体类来Cylinder来介绍静态方法的使用
class Cylinder
{
    private static int num = 0;
    private  static double pi = 3.14;
    private double radius;
    private int height;
    public Cylinder(double r,int h)
    {
        radius = r;
        height = h;
        num++;  //构造方法被调用时 num加一
    }
    public static void count()  //count()为静态方法
    {
        System.out.println("创建了"+num+"个对象");
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

public class App7_9
{
    public static void main(String[] args)
    {
        Cylinder.count();

        Cylinder volu1 = new Cylinder(2.5,3);
        volu1.count();//用对象调用
        System.out.println("圆柱1的体积="+volu1.volume());

        Cylinder volu2 = new Cylinder(1.0,2);
        Cylinder.count();//用类名调用
        System.out.println("圆柱体2的体积="+volu2.volume());
    }
}
