package App7_3;
//在圆柱体类Cylinder中，利用方法重载来设置成员变量
class Cylinder
{
    private double radius;
    private int height;
    private double pi=3.14;
    private String color;
    public double setCylinder(double r,int h)   //重载方法
    {
        radius = r;
        height = h;
        return r+h;
    }
    public void setCylinder(String str)  //方法重载
    {
        color=str;
    }


    public void show()  //显示颜色
    {
        System.out.println("圆柱的颜色为："+color);
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

public class App7_3
{
    public static void main(String[] args)
    {
        double r_h;
        Cylinder volu = new Cylinder();
        r_h=volu.setCylinder(2.5,5);
        volu.setCylinder("红色");

        System.out.println("圆柱底面半径和高之和="+r_h);
        System.out.println("圆柱体体积="+volu.volume());
        volu.show();

    }
}
