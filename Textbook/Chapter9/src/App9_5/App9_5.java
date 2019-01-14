package App9_5;
//利用命令行提供一个成绩 若超过两位数抛出空指针异常
public class App9_5
{
    static void check(String str1) throws  NullPointerException //方法头抛出空指针异常
    {
        if(str1.length()>2)
        {
            str1 = null;
            System.out.println(str1.length()); //试图输出空串长度会抛出空指针异常
        }

        char ch;
        for(int i=0;i<str1.length();i++)    //逐个位数检验
        {
            ch = str1.charAt(i);
            if(!Character.isDigit(ch))  //判断是否为数字
                throw new NumberFormatException();  //*方法中抛出格式异常
        }
    }

    public static void main(String[] args) throws Exception
    {
        int num;
        try
        {
            check(args[0]);
            num = Integer.parseInt(args[0]);
            if(num>60)
                System.out.println("成绩为：" +num+"及格");
            else
                System.out.println("成绩为："+num+"不及格");
        }
        catch (NullPointerException e)
        {
            System.out.println("空指针异常："+e.toString());
        }
        catch (NumberFormatException ex)//*捕获格式异常
        {
            System.out.println("输入的参数不是数值类型");
        }
        catch (Exception e)
        {
            System.out.println("命令行中没有提供参数");
        }
    }
}
