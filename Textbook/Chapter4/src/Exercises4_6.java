public class Exercises4_6   //水仙花数：各位十位百位数字的立方和等于这个三位数本身 求出所有水仙花数
{
    public static void main(String[] args)
    {
        int k,n,s,i=100;
        do{
            s=0;
            n=i;
            while (n!=0)
            {
                k=n%10; //此位
                n=n/10; //进行下一位
                s=s+k*k*k;  //计算和 直到n为0
            }
            if(i==s)
                System.out.print(s+" ");
            i++;    //用i遍历每一个数
        }while(i<999);
    }
}
