package App12_9;
//程序运行时，将在命令行方式下输入的每个字符串添加到哈希集合中，集合中已经有的元素不能添加，并将重复的元素输出。最后再对集合进行遍历，输出其所有元素
import java.util.*;
public class App12_9
{
    public static void main(String[] args)
    {
        HashSet<String>hs= new HashSet<String>();   //创建哈希集合对象hs，初始容量为16
        for(String a:args)
            if(!hs.add(a))  //向哈希集合中添加元素 但重复元素不能添加
                System.out.println("元素"+a+"重复");//输出重复的元素

        System.out.println("集合容量为："+hs.size()+",各元素为：");
        Iterator it = hs.iterator();//创建哈希集合hs的迭代器it
        while (it.hasNext())    //判断集合中是否还有后序元素
            System.out.print(it.next()+" ");  //输出元素
    }
}
