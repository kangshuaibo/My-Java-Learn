public class APP4_3 //利用switch语句来判断 用户从键盘上输入运算符，再输出计算后的结果
{
    public static void main(String[] args)throws Exception
    {
        int a=100,b=6;
        char oper;
        System.out.println("请输入运算符");
        oper=(char)System.in.read();    //从键盘读入一个字符存入变量oper中

        switch (oper)
        {
            case'+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case'-':
                System.out.println(a+"-"+b+"="+(a+b));
                break;
            case'*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+((float)a/b));
                break;
                default:
                    System.out.println("输入的符号不正确");
        }

    }
}
