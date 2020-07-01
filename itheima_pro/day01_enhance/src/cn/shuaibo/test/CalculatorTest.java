package cn.shuaibo.test;

import cn.shuaibo.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 初始化方法：
     * 用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    @Before//修饰的方法会在测试方法之前被自动执行
    public void init(){
        System.out.println("init...");
    }

    /**
     * 释放资源方法：
     * 在所有测试方法执行完后，都会自动执行该方法
     */
    @After//修饰的方法会在测试方法执行之后自动被执行
    public void close(){
        System.out.println("close...");
    }





    /*
    * 测试add方法
    * */
    @Test
    public void testAdd(){
        //System.out.println("我被执行了");

        //1.创建计算器对象
        System.out.println("testadd...");
        Calculator c = new Calculator();
        //2.调用add方法
        int result = c.add(1, 2);
        //System.out.println(result);

        //3。断言 我断言这个结果是3
        Assert.assertEquals(3,result);  //期望的结果，运算的结果
    }

    @Test
    public void testSub(){
        //1。创建计算器对象
        Calculator c = new Calculator();
        int result = c.sub(1,2);
        System.out.println("testsub...");
        Assert.assertEquals(-1,result);
    }
}
