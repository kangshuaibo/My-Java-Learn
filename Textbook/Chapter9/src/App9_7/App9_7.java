package App9_7;
//计算圆面积时 圆半径不允许是负值，因此自定义一个半径为负值的异常类CircleException。 若给定圆半径为负数时，抛出相应异常，并捕获与处理
class CircleException extends Exception//自定义异常类
{
    double radius;
    CircleException(double r)   //自定义异常类构造方法
    {
        radius = r;
    }
    public String toString()
    {
        return "半径 r="+radius+"不是一个正数";
    }
}
class Circle
{
    private double radius;
    public void setRadius(double r) throws CircleException  //由方法抛出异常
    {
        if(r<0)
            throw new CircleException(r);
        else
            radius = r;
    }
    public void show()
    {
        System.out.println("圆面积="+3.14*radius*radius);
    }
}
public class App9_7
{
    public static void main(String[] args)
    {
        Circle cir=new Circle();
        try
        {
            cir.setRadius(-2.0);
        }
        catch(CircleException e)
        {
            System.out.println("自定义异常类："+e.toString()+"");
        }
        cir.show();
    }
}
