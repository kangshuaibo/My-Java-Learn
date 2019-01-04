public class Exercises4_11_2
{
    public static void main(String[] args)
    {
        int i,count,a,c;
        int b=1;
        for(count=1;count<=5;count++)
        {
            c=count;
            c--;
            a=b+c;
            b=a;
            System.out.println(b+" ");
            for(i=1+count;i<=5;i++)
            {
                a+=i;
                System.out.print(a+" ");
            }
            System.out.println("\n");
        }
    }
}
