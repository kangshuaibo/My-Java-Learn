public class Exercises5_7   //比较命令行中给出的两个字符串是否相等 并输出比较结果
{
    public static void main(String[] args)
    {
        boolean yn=false;
        if (args.length<=1)
            System.out.println("命令行中数据个数不对");
        else if(args[0].equals(args[1]))
        {
            yn=true;
            System.out.println("命令行输出结果是："+yn);
        }
        else
        {
            System.out.println("命令行给出的两个字符串比较结果是"+yn);
        }
    }
}
