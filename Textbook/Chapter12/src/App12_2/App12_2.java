package App12_2;
//泛型方法的应用
public class App12_2
{
    public static void main(String[] args)
    {
        Integer[] num = {1,2,3,4,5};    //定义数组
        String[] str = {"红","橙","黄","绿","青","蓝","紫",};
        App12_2.display(num);//用类名调用泛型静态方法
        App12_2.display(str);

    }
    public static <E>void display(E[] list)    //定义泛型方法 E为类型参数
    {
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");
        System.out.println();
    }
}
