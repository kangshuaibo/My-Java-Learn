package App12_6;
//定义一个泛型类，并在该类型里利用类型参数声明数组
public class App12_6<T>
{
    private T[] array;  //用类型参数声明数组，即定义泛型数组
    public void setT(T[] array) //方法的参数接收的数组是类型参数T的类型
    {
        this.array= array;
    }
    public T[] getT()   //方法返回值是类型参数T类型的数组
    {
        return array;
    }
    public static void main(String[] args)
    {
        App12_6<String>a = new App12_6<String>();   //创建泛型对象
        String[] array = {"红色","橙色","黄色","绿色","青涩","蓝色","紫色"};
        a.setT(array);  //用数组调用setT()方法
        for(int i=0;i<a.getT().length;i++)
            System.out.print(a.getT()[i]+" ");  //调用getT()方法输出数组中的值
    }
}
