public class APP3_2 //整形与浮点型转换
{
    public static void main(String[] args)
    {
        int a=155;
        int b=9;
        float g,h;

        System.out.println("a="+a+",b="+b); //输出a和b的值
        g=a/b;
        System.out.println("a/b="+g+"\n");  //输出g的值

        System.out.println("a="+a+",b="+b);     //输出a和b的值
        h=(float)a/b;   //将a强制转换后再参与运算
        System.out.println("a/b="+h);   //输出h的值
    }
}
