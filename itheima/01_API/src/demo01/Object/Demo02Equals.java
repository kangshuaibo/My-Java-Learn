package demo01.Object;

import java.util.ArrayList;

public class Demo02Equals
{
    public static void main(String[] args) {
        /*Persom类默认继承了Object类，所以可以使用Object类的equals方法
        * boolean	equals(Object obj) 指示其他某个对象是否与此对象“相等”。
        * equals方法源码：
             public boolean equals(Object obj) {
                 return (this == obj);
             }
             参数：
                Object obj：可以传递任意的对象
                ==比较运算符，返回的是一个布尔值 true/false
                基本数据类型：比较的是值
                引用数据类型：比较的是两个对象的地址(equals方法的默认)
             this是谁？哪个对象调用的方法，方法中的this就是那个对象； p1调用的equls方法所以this就是p1
             obj是谁？传递过来的参数p2
             this==obj --> p1==p2
          */
        Person p1 = new Person("迪丽热巴",18);
        //Person p2 = new Person("古力娜扎",19);
        Person p2 = new Person("迪丽热巴",18);
        System.out.println("p1:"+p1);//p1:demo01.Object.Person@2d209079
        System.out.println("p2:"+p2);//p2:demo01.Object.Person@6bdf28bb

       // p1=p2;  //把p2的地址值赋值给p1
        ArrayList<String> list = new ArrayList<>();

        boolean b = p1.equals(p1); //p2｜list异常ClassCastException ｜null ｜p1
        System.out.println(b);
    }
}
