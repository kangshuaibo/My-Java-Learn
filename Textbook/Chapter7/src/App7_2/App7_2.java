package App7_2;
//创建圆柱体类Cylinder的公共成员方法，来访问类内的私有成员变量
class Cylinder
{
    private double radious;
    private int height;
    private double pi=3.14;

    public void setCylinder(double r,int h) //声明公共方法
    {
        if(r>0 && h>0)
        {
            radious=r;
            height=h;
        }
        else
            System.out.println("您的数据有错误！！");
    }

    double area()
    {
        return pi*radious*radious;
    }

    double volume()
    {
        return area()*height;
    }
}

public class App7_2 //
{
    public static void main(String [] args)
    {
        Cylinder volu = new Cylinder();
        volu.setCylinder(2.5,-5);   //不能直接访问 要通过公共方法访问私有变量
        System.out.println("圆柱底面积="+volu.area());
        System.out.println("圆柱体体积="+volu.volume());
    }
}
