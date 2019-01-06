package App6_3;

class Cylinder
{
    double radius;
    int heigh;
    double pi=3.14;
    //area返回圆的底面积
    double area()
    {
        return pi*radius*radius;
    }
    //volume返回圆柱的体积
    double volume()
    {
        return this.area()*heigh;   //类中调用本身的方法 用tihs
    }
}

public class App6_3
{
    public static void main(String[] args)
    {
        Cylinder volu;
        volu= new Cylinder();   //创建对象

        volu.radius=2.8;
        volu.heigh=5;

        System.out.println("底面半径="+volu.radius);
        System.out.println("圆柱的高="+volu.heigh);
        System.out.print("圆柱");
        System.out.println("底面积="+volu.area());
        System.out.println("体积="+volu.volume());

    }
}
