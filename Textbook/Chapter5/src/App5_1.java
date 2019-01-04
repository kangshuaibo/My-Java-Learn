public class App5_1 //声明一个一维数组 长度为5 用循环对数组赋值 再利用循环逆向输出
{
    public static void main(String[] args)
    {
        int i;
        int[] a;    //声明一个数组a
        a=new int[5];   //分配内存空间给整形数组使用

        //数组赋值
        for(i=0;i<5;i++)
            a[i]=i;

        //逆向输出
        for(i=a.length-1; i>=0 ;i--)
            System.out.print("a["+i+"]="+a[i]+",\t");
        System.out.println("\n数组a的长度是："+a.length); //java语言 每个数组都有一个length属性 指明该数组长度
    }

}
