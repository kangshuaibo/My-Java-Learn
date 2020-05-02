package proxy6_10;

import java.lang.reflect.*;
import java.util.*;

public class ProxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];

        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1; //integer实现了Comparable<Integer>接口
            InvocationHandler handler = new TraceHandler(value);    //一个调用处理器
            Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler); //创建一个代理对象 参数：加载器类 对象数组 调用处理器
            elements[i] = proxy;
        }
        //构建随机整数
        Integer key = new Random().nextInt(elements.length) + 1;
        //找这个整数
        int result = Arrays.binarySearch(elements, key);//二分查找实现了这个接口 if (elements[i].compareTo(key) < 0)
        //打印匹配
        if (result >= 0)
            System.out.println(elements[result]);
        ///1
        ///1
        ///1¥¥
    }
}

class TraceHandler implements InvocationHandler //调用处理器 在运行时创建新类 包装器类存储包装的对象
{
    private Object target;

    public TraceHandler(Object t) {
        target = t;
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable //调用处理器接口重写的方法
    {
        System.out.print(target);
        System.out.print("." + m.getName() + "(");  //得到方法名
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1)
                    System.out.print(",");
            }
        }
        System.out.println(")");

        return m.invoke(target, args);


    }

}
