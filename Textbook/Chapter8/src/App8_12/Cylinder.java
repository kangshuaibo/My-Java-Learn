package App8_12;
//接口的继承
interface Face1     //接口
{
    final double PI = 3.14;
    abstract double area();
}
interface Face2     //接口
{
    abstract void setColor(String c);
}
interface Face3 extends Face1,Face2     //接口的多重继承（继承）
{
    abstract void volume();
}

public class Cylinder implements Face3  //定义Cylinder类 实现Face3接口（实现）
{
    private double radius;
    private int height;
    protected String color;
    public Cylinder(double r,int h)
    {
        radius = r;
        height = h;
    }
    public double area()
    {
        return PI*radius*radius;
    }
    public void setColor(String c)
    {
        color = c;
        System.out.println("颜色："+color);
    }
    public void volume()
    {
        System.out.println("圆柱体体积="+area()*height);
    }
    public static void main(String[] args)
    {
        Cylinder volu = new Cylinder(3.0,2);
        volu.setColor("红色");
        volu.volume();
    }
}
