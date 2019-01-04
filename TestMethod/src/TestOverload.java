/**
 * 测试重载
 */
public class TestOverload {
    public static void main(String[] args){
    System.out.println(add(3,5));
    System.out.println(add(3,5,10));
    System.out.println(add(3.0,5));
    System.out.println(add(3,5.0));//static方法不需要通过对象调用
    }

       /*求和方法*/
    public static int add(int n1,int n2){//因为有static所以调用时不需要通过对象
        int sum = n1+n2;
        return sum;
    }

    //方法名相同，参数个数不同，构成重载
    public static int add(int n1,int n2,int n3){
        int sum = n1+n2+n3;
        return sum;
    }

    //方法名相同，参数个数不同，构成重载
    public static double add(double n1,int n2){
        double sum =n1 + n2;
        return sum;
    }

    //方法名相同，参数个数不同，构成重载
    public static double add(int n1,double n2){
        double sum =n1+n2;
        return sum;
    }

}


/*
//注意：只有返回值不同不构成重载 只有参数名称不同不构成重载

public static double add(int n1,int n2){ //只有返回值类型不同double和int
    double sum = n1+n2;
    retuen sum;
}

public static int add(int n2,int n1){//只有参数名不同 n1和n2
    double sum = n1+n2;
    return sum;
}


*/