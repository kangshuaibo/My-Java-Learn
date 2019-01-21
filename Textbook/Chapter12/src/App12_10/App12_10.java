package App12_10;
//先创建一个哈希集合对象hs，并向其添加元素；然后利用hs创建树集合兑现ts，之后利用树集合的相应方法输出某些元素
import java.util.*;
public class App12_10
{
    public static void main(String[] args)
    {
        Set<String>hs = new HashSet<String>();  //创建哈希集合对象hs
        hs.add("唐僧");
        hs.add("孙悟空");
        hs.add("猪八戒");
        hs.add("沙和尚");
        hs.add("白龙马");
        TreeSet<String>ts = new TreeSet<String>(hs);    //利用hs创建树集合对象ts

        System.out.println("树集合："+ts);//输出树集合
        System.out.println("树集合的第一个元素："+ts.first());
        System.out.println("树集合的最后一个元素："+ts.last());
        System.out.println("headSet(孙悟空)的元素："+ts.headSet("孙悟空"));   //返回之前的元素 包含本元素
        System.out.println("tailSet(孙悟空)的元素："+ts.tailSet("孙悟空"));   //返回之后的元素 包含本元素
        System.out.println("ceiling(沙)的元素："+ts.ceiling("沙"));   //找比当前大的最小元素
    }
}
