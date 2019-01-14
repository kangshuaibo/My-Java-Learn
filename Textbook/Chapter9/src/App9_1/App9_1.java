package App9_1;
//产生异常
public class App9_1
{
    public static void main(String[] args)
    {
        int i;
        int[] a= {1,2,3,4};
        for(i=0;i<5;i++)
            System.out.println(" a["+i+"]="+a[i]);
        System.out.print("5/0"+(5/0));
    }
}
