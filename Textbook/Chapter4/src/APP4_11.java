public class APP4_11    //求1到10的累加和
{
    public static void main(String[] args)
    {   //从1到10累加求和
        int i,n=10,s=0;
        for(i=1;i<=n;i++)
            s=s+i;
        System.out.println("sum=1+...+"+n+"="+s);


        //从10到2进行累加求和
        s=0;
        System.out.print("Sum=");
        for(i=n;i>1;i--)
        {
            s+=i;
            System.out.print(i+"+");    //循环输出i和加号
        }
        System.out.println(i+"="+(s+i));
    }

}
