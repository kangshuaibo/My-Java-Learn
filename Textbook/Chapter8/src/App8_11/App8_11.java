package App8_11;
//利用形状接口IShipe建造类


interface IShape//定义接口
{
    final double PI = 3.14;
    abstract double getArea();
    abstract double getLength();
}

class Circle implements IShape
{
    double radius;
    public Circle(double r)
    {
        this.radius = r;
    }
    public double getArea()
    {
        return PI*radius*radius;
    }
    public double getLength()
    {
        return 2*PI*radius;
    }
}

class Rectangle implements IShape
{
    private double width;
    private double height;
    public Rectangle(double width,double height)
    {
        this.width = width;
        this.height = height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getLength()
    {
        return 2*(width+height);
    }
}

public class App8_11
{
    public static void main(String[] args)
    {
        IShape circle = new Circle(5.0);//声明父接口变量circle 指向子类对象
        System.out.print("园面积="+circle.getArea());
        System.out.println("；周长="+circle.getLength());

        Rectangle rect = new Rectangle(6.5,10.8);//声明Rectangle类的变量rect
        System.out.print("矩形面积="+rect.getArea());
        System.out.println("; 周长="+rect.getLength());
    }
}
