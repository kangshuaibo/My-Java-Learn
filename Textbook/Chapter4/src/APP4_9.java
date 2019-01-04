import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APP4_9 //辗转相除法求两个数最大公约数
{
    public static void main(String[] args)throws IOException
    {
        int a,b,k;
        String str1,str2;
        BufferedReader buf;
        buf=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入第一个数a=");
        str1=buf.readLine();
        a=Integer.parseInt(str1);

        System.out.println("请输入第二个数b=");
        str2=buf.readLine();
        b=Integer.parseInt(str2);

        System.out.print("gcd("+a+","+b+")=");
        do {
            k=a%b;
            a=b;
            b=k;
        }while (k!=0);  //余数k不为0 继续进行下一次相除
        System.out.println(a);


    }
}
