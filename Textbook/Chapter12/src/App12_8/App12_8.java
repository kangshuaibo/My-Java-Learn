package App12_8;
//创建一个数组列表对象 并向其添加元素，然后对列表的元素进行修改并遍历
import java.util.*;
public class App12_8
{
    public static void main(String[] args)
    {
        List <Integer> a1 = new ArrayList<Integer>();   //创建数组列表对象a1
        for(int i= 1;i<5;i++)
            a1.add(new Integer(i));     //向数组列表a1中添加元素i
        System.out.println("数组列表的原始数据"+a1);

        ListIterator<Integer>listIter = a1.listIterator();  //创建a1的迭代器listIter 😄没有参数默认在最头位置
        listIter.add(new Integer(0));   //在最开始位置添加一个值为0 的元素
        System.out.println("添加数据后的数组列表："+a1);

        if(listIter.hasNext())//如果有后序元素
        {
            int i = listIter.nextIndex(); //i的值为1
            listIter.next();    //返回序号为1的元素
            listIter.set(new Integer(9));   //修改序号为1的元素 值改为9
            System.out.println("修改数据后的数组列表："+a1);
        }

        listIter = a1.listIterator(a1.size());              //创建迭代器 😄有参数为最后位置
        System.out.print("反向遍历数组列表：");
        while(listIter.hasPrevious())  //有前驱就输出前驱
            System.out.print(listIter.previous()+" ");
    }
}
