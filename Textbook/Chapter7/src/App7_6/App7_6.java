package App7_6;
//在圆柱体Cylinder中，用一个构造方法调用另一个构造方法、

class Cylinder
{
    private double radius;
    private int height;
    private double pi=3.14;
    String color;

    public Cylinder()   //定义无参数的构造方法
    {
        this(2.5,5,"红色");       //另一个构造方法的调用
        System.out.println("无参数构造方法被调用了");
    }
    public Cylinder(double r,int h,String str)  //定义有有参数的构造方法
    {
        System.out.println("有参数构造方法被调用了");
        radius = r;
        height = h;
        color = str;
    }
    void show()
    {
        System.out.println("圆柱体半径为="+radius);
        System.out.println("圆柱体高为="+height);
        System.out.println("圆柱体的颜色为"+color);
    }

    double ares()
    {
        return pi*radius*radius;
    }
    double volume()
    {
        return ares()*height;
    }
}
public class App7_6
{
    public static void main(String[] args)
    {
        Cylinder volu = new Cylinder();
        System.out.println("圆柱底面积="+volu.ares());
        System.out.println("圆柱体体积="+volu.volume());
        volu.show();
    }
}
