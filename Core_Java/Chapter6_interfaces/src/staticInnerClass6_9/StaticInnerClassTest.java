package staticInnerClass6_9;


import java.util.Arrays;

public class StaticInnerClassTest
{
    public static void main(String[] args)
    {
        double[] d = new double[20];
        for(int i = 0;i<d.length;i++)
            d[i] = 100 * Math.random(); //随机给数组20个数
        ArrayAlg.Pair p = ArrayAlg.minmax(d);   //用静态方法构建一个内部类对象
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}

class ArrayAlg
{
    public static class Pair//内部类 必须是静态 因为是在静态方法中构建的 不需要访问外围类对象
    {
        private double first;
        private double second;

        public Pair(double f, double s) //内部类构造器的域 用ArrayAlg.Pair访问他
        {
            first = f;
            second = s;
        }

        public double getFirst()
        {
            return first;
        }

        public double getSecond()
        {
            return second;
        }
    }

    public static Pair minmax(double[] values) //内部类对象在静态方法中构造
    {
        double min = Double.POSITIVE_INFINITY;   //正无穷
        double max = Double.NEGATIVE_INFINITY;

        for(double v:values)
        {
            if(min>v)
                min=v;
            if(max<v)
                max=v;
        }
        return new Pair(min,max); //返回一个内部类对象 内部类构造器的域赋值
    }


}