package com.shuaibo.demo06.Lambda;
/*
    使用Lambda标准格式（有参有返回）
        题目:
        给定一个计算器Calculator 接口，内含抽象方法calc 可以将两个int数字相加得到和值：
        请使用Lambda的标准格式调用invokeCalc 方法，完成120和130的相加计算：
 */
public class Demo01Calculator {
    public static void main(String[] args) {
        //调研invokeCalc方法，方法的参数是一个接口，可以使用匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });


        //使用Lambda表达式简化匿名内部类的书写
        invokeCalc(130,120,(int a,int b)->{
            return a + b;
        });


        //省略优化Lambda表达式
        invokeCalc(130,120,(a,b)-> a + b);
    }

    /*
        定义一个方法
        参数传递两个int类型的整数
        参数传递Calculator接口
        方法内部调用Calculator中的方法calc计算两个整数的和
     */
    public static void invokeCalc(int a, int b, Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
