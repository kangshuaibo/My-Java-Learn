package com.shuaibo.demo03.sleep;
/*
    static void	sleep(long millis)  在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
    毫秒数结束之后，线程继续执行

 */
public class Demo01Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法让线程睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
