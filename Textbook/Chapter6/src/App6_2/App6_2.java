package App6_2;

class Cylinder
{
    double radius;
    int heigh;
    double pi=3.14;
    void area()     //area直接输出圆的底面积
    {
        System.out.println("体底面积为："+pi*radius*radius);
    }

    double volume() //volume返回圆柱的体积
    {
        return pi*radius*radius*heigh;
    }
}

public class App6_2 //同时创建多个圆柱体类Cylinder的对象，并修改其中一个对象的成员变量pi的值
{
    public static void main(String[] args)
    {
        Cylinder volu1,volu2;
        volu1=new Cylinder();
        volu2=new Cylinder();
        volu1.radius=volu2.radius=2.5;
        volu2.pi=3; //更改圆柱体2的半径

        System.out.println("圆柱体1底面半径="+volu1.radius);
        System.out.println("圆柱体2底面半径="+volu2.radius);

        System.out.println("圆柱体1的pi值="+volu1.pi);
        System.out.println("圆柱体2底pi值="+volu2.pi);

        System.out.print("圆柱1");
        volu1.area();
        System.out.print("圆柱2");
        volu2.area();
    }
}
