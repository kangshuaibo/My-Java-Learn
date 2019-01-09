package APP7_5;
class Cylinder
{
    private double radius;
    private int height;
    private double pi =3.14;
    String color;
    public Cylinder()   //定义无参数的构造方法
    {
        radius = 1;
        height = 2;
        color="绿色";
    }
    public Cylinder(double r,int h,String str)  //定义有三个参数的构造方法
    {
        radius = r;
        height = h;
        color = str;
    }

    public void setColor()
    {
        System.out.println("该圆柱的颜色为："+color);
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


public class APP7_5
{
    public static void main(String[] args)
    {
        Cylinder volu1 = new Cylinder();
        System.out.println("圆柱1底面积="+volu1.area());
        System.out.println("圆柱1的体积="+volu1.volume());
        volu1.setColor();

        Cylinder volu2 = new Cylinder(2.5,8,"红色");
        System.out.println("圆柱体2底面积="+volu2.area());
        System.out.println("圆柱体2体积="+volu2.volume());
    }
}
