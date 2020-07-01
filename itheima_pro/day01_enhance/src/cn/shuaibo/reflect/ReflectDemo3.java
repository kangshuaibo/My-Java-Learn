package cn.shuaibo.reflect;


import cn.shuaibo.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo3 {
    /**
     * * Class对象功能：
     * 	* 获取功能：
     * 		1. 获取成员变量们
     * 			* Field[] getFields() ：获取所有public修饰的成员变量
     * 			* Field getField(String name)   获取指定名称的 public修饰的成员变量
     *
     * 			* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
     * 			* Field getDeclaredField(String name)
     * 		2. 获取构造方法们
     * 			* Constructor<?>[] getConstructors()
     * 			* Constructor<T> getConstructor(类<?>... parameterTypes)
     *
     * 			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * 			* Constructor<?>[] getDeclaredConstructors()
     * 		3. 获取成员方法们：
     * 			* Method[] getMethods()
     * 			* Method getMethod(String name, 类<?>... parameterTypes)
     *
     * 			* Method[] getDeclaredMethods()
     * 			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)
     *
     * 		4. 获取全类名
     * 			* String getName()
     */

    public static void main(String[] args) throws Exception {
        //0。获取Person的Class对象
        Class personClass = Person.class;
        /*
            2. 获取构造方法们
     * 			* Constructor<?>[] getConstructors()
     * 			* Constructor<T> getConstructor(类<?>... parameterTypes)
     *
     * 			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * 			* Constructor<?>[] getDeclaredConstructors()
         */


        //Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);


        System.out.println("--------------");

        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor);
        //创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);


        //如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法
        Object o = personClass.newInstance();
        System.out.println(o);


        constructor1.setAccessible(true);   //暴力反射
    }


}
