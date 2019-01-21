package App12_11;
//创建一个哈希映射类hashMap对象，并向其添加若干个元素后，删除其中的某元素。
// 之后再创建一个树映射类TreeMap的对象，并将HashMap对象中的元素添加其中。
// 然后分别遍历由HashMap与TreeMap类实现的Map映射
import java.util.*;
public class App12_11
{
    public static void main(String[] args)
    {   //输入 并显示元素
        Map<String ,String>hm = new HashMap<String, String>();  //创建HashMap对象hm
        hm.put("006","唐僧"); //将元素添加到映射
        hm.put("008","孙悟空");
        hm.put("00900","猪八戒");
        hm.put("007","沙和尚");
        hm.put("010","白龙马");
        System.out.println("哈希映射中的内容如下：\n"+hm); //输出hm中的元素

        //删除一个
        String str = (String)hm.remove("010");  //再hm中删除健值为"010"的元素

        //HashMap集合
        Set keys = hm.keySet(); //获取哈希映射hm的键对象集合

        Iterator it = keys.iterator();  //获取键对象集合keys的迭代器
        System.out.println("HashMap类实现的Map映射，无序：");
        while (it.hasNext())    //判断是否还有后序元素
        {
            String xh = (String)it.next();  //返回键值
            String name = (String)hm.get(xh);//返回键所对应的元素值
            System.out.println(xh+" "+name);
        }

        //TreeMap集合
        TreeMap<String,String>tm = new TreeMap<String, String>();   //创建TreeMap对象tm
        tm.putAll(hm);  //将hm的元素添加到树映射对象tm中

        Iterator iter = tm.keySet().iterator(); //获取迭代器
        System.out.println("TreeMap类实现的Map映射，键值升序：");
        while (iter.hasNext())
        {
            String xh = (String)iter.next();    //返回键
            String name = (String)hm.get(xh);   //返回键所对应的值
            System.out.println(xh+" "+name);
        }
    }
}
