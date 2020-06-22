package com.shuaibo.demo02.Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T> 是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
    获取一个流非常简单，有以下几种常用的方式：
        1. 所有的Collection 集合都可以通过stream 默认方法获取流；
            default Stream<E>	stream​()
        2. Stream 接口的静态方法of 可以获取数组对应的流。
            static <T> Stream<T>	of​(T... values)
            参数是一个可变参数，那么我们就可以传递一个数组
 */
public class Demo02GetStream {
    public static void main(String[] args) {
    //把集合转换为Stream流
        //1
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        //2
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        //3
        Map<String,String> map = new HashMap<>();
          //获取键，存储到一个Set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream = keySet.stream();
          //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
          //获取键值对（健与值的映射关系 entrySet
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

    //把数组转换为Stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] arr2 = {"a","bb","ccc"};
        Stream<String> stream8 = Stream.of(arr2);

    }
}
