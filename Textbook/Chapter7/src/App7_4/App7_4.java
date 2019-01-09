package App7_4;
//利用 构造方法 来初始化圆柱体类Cylinder的成员变量

class Cylinder
{
    private double radius;
    private int height;
    private double pi=3.14;
    public Cylinder(double r,int h)     //构造方法 1、与类名相同 2、没有返回值 却不用void修饰
    {
        radius = r;
        height = h;
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
public class App7_4
{
    public static void main(String[] args)
    {
        Cylinder volu = new Cylinder(3.5,8);    //创建对象时 3、直接自动调用方法
        System.out.println("圆柱底面积="+volu.area());
        System.out.println("圆柱体体积="+volu.volume());
    }
}
