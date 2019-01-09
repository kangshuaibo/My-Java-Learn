package App7_7;
//创建圆柱体类Cylinder，并在该类的一个构造方法内调用另一个私有的构造方法
class Cylinder
{
    private double radius;
    private int height;
    private double pi=3.14;
    String color;
    private Cylinder()//定义私有构造方法
    {
        System.out.println("无参构造方法被调用");
    }
    public Cylinder(double r,int h,String str)//定义三个有参数的构造方法
    {
        this();//在公共构造方法中 用this关键字来调用另一构造方法
        radius=r;
        height=h;
        color=str;
    }
    public void show()
    {
        System.out.println("圆柱底面半径为"+radius);
        System.out.println("圆柱体的高为"+height);
        System.out.println("圆柱的颜色为"+color);
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
public class App7_7
{
    public static void main(String[] args)
    {
        Cylinder volu =new Cylinder(2.5,5,"蓝色");
        System.out.println("圆柱底面积="+volu.area());
        System.out.println("圆柱体体积="+volu.volume());
        volu.show();
    }
}
