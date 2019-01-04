public class App5_2 //设数组中有n个互不相同的数 不用排序求出其中 最大值 和 次最大值
{
    public static void main(String[] args)
    {
        int i,max,sec;
        int[] a={8,50,20,7,81,55,76,93};
        if(a[0]>a[1])
        {
            max=a[0];
            sec=a[1];
        }
        else
        {
            max=a[1];
            sec=a[0];
        }
        System.out.print("数组各个元素为："+a[0]+" "+a[1]);
        for(i=2;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
            if(a[i]>max)
            {
                sec=max;
                max=a[i];
            }
            else if(a[i]>sec)
            {
                sec=a[i];
            }
        }
        System.out.print("\n其中的最大值是："+max);
        System.out.print("  次最大值是："+sec);
    }
}
