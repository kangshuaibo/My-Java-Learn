public class APP3_8 //关系运算符和逻辑运算符的使用
{
    public static void main(String[] args)
    {
        int a=25,b=7;
        boolean x=a<b;  //x=false

        System.out.println("a<b="+x);
        int e=3;
        boolean y=a/e>5;    //y=true
        System.out.println("x^y="+(x^y));

        if(b<0&e!=0)    //非简洁运算符 左右都要计算
            System.out.println("b/0="+b/0); //此处永远不会被计算   不会发生0溢出错误
        else
            System.out.println("a%e="+a%e);


        int f=0;
        if(f!=0 && a/f>5) //简洁运算符 左边不成立就不算右边了     故右边不会发生0溢出错误
            System.out.println("a/f="+a/f);//此处永远不会被计算
        else
            System.out.println("f="+f);


    }

}
