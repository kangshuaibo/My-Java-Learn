package App12_4;
//有限制的泛型类
class GeneralType<T extends Number> //类型参数T必须是Number类 或者是其子类
{
    T obj;
    public GeneralType(T obj)   //定义泛型类的构造方法
    {
        this.obj = obj;
    }
    public T getObj()   //定义泛型类的方法
    {
        return obj;
    }
}
public class App12_4
{
    public static void main(String[] args)
    {
        GeneralType<Integer>num = new GeneralType<Integer>(5);  //创建泛型类对象num
        System.out.println("给出的参数是："+num.getObj());

        //下面是非法的
        /*
        GeneralType<String>s = new GeneralType<String>("Hello");
        System.out.println("给出的参数是："+s.getObj());
        */

    }
}
