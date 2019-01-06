package App7_1;
class Cylinder
{
    private double radios=1;
    private int height=2;
    private double pi=3.14;

    double ares()
    {
        return pi*radios*radios;
    }
    double volume()
    {
        return ares()*height;   //类内部可以访问私有成员height
    }
}

public class App7_1
{
    public static void main(String[] args)
    {
        Cylinder volu;
        volu= new Cylinder();
        /*
        //错误的
        volu.radios = 2.8;
        volu.height = -5;
        //错误的
        System.out.println("底面半径="+volu.radios);
        System.out.println("圆柱的高="+volu.height);
        */
        System.out.print("圆柱");
        System.out.println("底面积="+volu.ares());
        System.out.println("体积="+volu.volume());
    }
}
