package App8_13;
//利用接口实现类的多重继承
interface Face1
{
    final double PI= 3.14;
    abstract double area();
}
interface Face2
{
    abstract void volume();
}

public class Cylinder implements Face1,Face2    //多重继承
{
    private double radius;
    private int height;
    public Cylinder(double r,int h)
    {
        radius = r;
        height = h;
    }
    public double area()
    {
        return PI*radius*radius;
    }
    public void volume()
    {
        System.out.println("圆柱体体积="+area()*height);
    }
    public static void main(String[] args)
    {
        Cylinder volu = new Cylinder(5.0,2);
        volu.volume();
    }
}
