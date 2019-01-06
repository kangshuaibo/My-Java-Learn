package App6_1;

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

public class App6_1     //定义一个圆柱体类 Cylinder,并创建相应的对象，然后计算底面积和体积
{
    public static void main(String[] args)
    {
        Cylinder volu;
        volu= new Cylinder();   //创建新对象

        volu.radius=2.8;
        volu.heigh=5;
        //输出半径和高
        System.out.println("底圆半径"+volu.radius);
        System.out.println("圆柱的高="+volu.heigh);

        //输出圆柱的底面积
        System.out.print("圆柱");
        volu.area();
        //输出圆柱体积
        System.out.println("圆柱体的体积="+volu.volume());
    }
}
