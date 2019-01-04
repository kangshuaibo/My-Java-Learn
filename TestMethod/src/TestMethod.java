/**
 * 测试方法的基本使用
 * @author 张天才
 */
public class TestMethod {
    public static void main(String[] args){
        //通过对象调用普通方法
        TestMethod tm = new TestMethod();   //开辟一个对象
        tm.printyun();  //通过对象调用方法
        int c = tm.add(30,40,50)+1000;  //通过对象调用的方法可以赋值给变量
        System.out.println(c);  //将变量打印
    }



    void printyun(){    //一个打印的方法
        System.out.println("我要打印什么呢");
        System.out.println("我要打印不知道呀");
        System.out.println("我要打印哈哈哈哈");
    }



    int add(int a,int b,int c){ //一个把三个数相加的方法
        int sum=a+b+c;
        System.out.println(sum);
        return sum;
    }
}
