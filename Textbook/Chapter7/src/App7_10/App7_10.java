package App7_10;
class Cylinder
{
    private static double pi= 3.14;
    private double radius;
    private int height;
    public Cylinder(double r,int h) //构造方法
    {
        radius=r;
        height= h;
    }
    public void setCylinder(double r,int h)
    {
        radius = r;
        height = h;
    }
    double volume()
    {
        return pi*radius*radius*height;
    }
}
public class App7_10    //创建圆柱体类Cylinder，并对该类生成的对象进行赋值运算
{
    public static void main(String[] args)
    {
        Cylinder volu1,volu2;
        volu1=new Cylinder(2.5,5);
        System.out.println("圆柱1的体积="+volu1.volume());

        volu2=volu1;    //指向了同一个对象
        volu2.setCylinder(1.0,2); //就是对这个对象进行修改
        System.out.println("圆柱2的体积="+volu1.volume());
    }
}
