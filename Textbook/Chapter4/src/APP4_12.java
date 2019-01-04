public class APP4_12    //求100以内的素数并输出
{
    public static void main(String[] args)
    {
        final  int MAX = 100;
        int j,k,n;
        System.out.println("2~"+MAX+"之间的所有素数为：");
        System.out.print("2\t");
        n=1;
        k=3;
        do {
            j=3;//用j去除待测试的数
            while ( j<Math.sqrt(k) && ( k%j != 0))  //有除尽的说明不是素数 推出循环
                j++;
            if(j>Math.sqrt(k))  //与while对立 全都没除尽 说明是素数
            {
                System.out.print(k+"\t");
                n++;

                if(n%10==0) //每行输出十个数
                    System.out.println( );
            }
            k=k+2;
        }while(k<MAX);
        System.out.println("\n共有"+n+"个素数");
    }

}
