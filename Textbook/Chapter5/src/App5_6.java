public class App5_6 //判断回文字符串
{
    public static void main(String[] args)
    {
        String str = "rotor";
        int i=0,n;
        boolean yn=true;

        if(args.length>0)
            str=args[0];        //运行时可带命令行参数 通过args[0]传给str😄

        System.out.println("要判断的str="+str+"\n");
        n=str.length();
        char sChar,eChar;
        //算法1
        while(yn && (i<n/2))
        {
            sChar=str.charAt(i);        //返回字符串str第i+1个位置的字符
            eChar =str.charAt(n-i-1);   //返回字符串str倒数第i+1个位置的字符
            System.out.println("sChar="+sChar+" echar="+eChar);
            if(sChar==eChar)
                i++;
            else
                yn=false;
        }
        System.out.println("算法1："+yn);
        System.out.println("\n");



        //算法二
        String temp="",sub1="";
        for(i=0;i<n;i++)
        {
            sub1=str.substring(i,i+1);
            temp=sub1+temp;     //截下来的放到前面
        }
        System.out.println("temp="+temp);
        System.out.println("算法2："+str.equals(temp));    //判断str与temp是否相等
    }
}
