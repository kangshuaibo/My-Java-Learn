package App8_10;
//抽象类的应用举例 定义一个形状抽象类 以该抽象类为父类派生出 圆形子类Circle和矩形子类Rectangle
abstract class Shape
{
    protected String name;
    public Shape(String xm) //抽象类中的一般方法 本方法为构造方法
    {
        name = xm;
        System.out.print("名称："+name);
    }
    abstract public double getArea();
    abstract public double getLength(); //声明抽象方法

}

class Circle extends Shape
{
    private final double PI=3.14;
    private double radius;
    public Circle(String shapeName,double r)    //构造方法
    {
        super(shapeName);
        radius = r;
    }

    @Override
    public double getArea()
    {
        return PI*radius*radius;
    }
    public double getLength()
    {
        return 2*PI*radius;
    }
}

class Rectangle extends Shape
{
    private double width;
    private double height;
    public Rectangle(String shapeName,double width,double height)
    {
        super(shapeName);
        this.width=width;
        this.height=height;
    }
    @Override
    public double getArea()
    {
        return width*height;
    }
    public double getLength()
    {
        return 2*(width+height);
    }

}
public class App8_10
{
    public static void main(String[] args)
    {
        Shape rect = new Rectangle("长方形",6.5,10.3);
        System.out.print("; 面积="+rect.getArea());
        System.out.println("; 周长="+rect.getLength());

        Shape circle = new Circle("园",10.2);
        System.out.print("; 面积="+circle.getArea());
        System.out.println("; 周长"+circle.getLength());
    }


}
