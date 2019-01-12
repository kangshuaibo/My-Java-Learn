package App8_15;
//匿名内部类的使用方法
public class App8_15
{
    static class Inner//定义内部类
    {
        String name;
    }

    public static void main(String[] args)
    {
        (//创建匿名内部类Inner的对对象
                new Inner()
                {
                    void setName(String n)
                    {
                        name = n;
                        System.out.println("姓名："+name);
                    }
                }
        ).setName("张华");//直接调用方法
    }

}
