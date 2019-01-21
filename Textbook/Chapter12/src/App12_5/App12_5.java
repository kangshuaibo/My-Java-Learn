package App12_5;

import javax.lang.model.element.NestingKind;

//类型通配符？的使用方法
class GeneralType<T>
{
    T obj;  //定义泛型类的成员变量
    public void setObj(T obj)   //定义泛型类方法
    {
        this.obj = obj;
    }
    public T getObj()   //定义泛型类方法
    {
        return obj;
    }
    //下面的方法接受的泛型类对象参数中的类型参数只能是String或String的子类
    public static void showObj(GeneralType<? extends String>o)///////////////////////
    {
        System.out.println("给出的值是："+o.getObj());
    }
}
public class App12_5
{
    public static void main(String[] args)
    {
        GeneralType<String > n = new GeneralType<String>();
        n.setObj("陈磊");
        GeneralType.showObj(n);                         //用类名调用showObj()方法输出

        GeneralType<Double>num = new GeneralType<Double>();
        num.setObj(25.0);
        System.out.println("数值型值："+num.getObj());   //不可调用方法showObj(num)输出
    }
}
