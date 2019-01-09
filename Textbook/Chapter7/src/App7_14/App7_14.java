package App7_14;
//以对象数组作为参数传递给方法，返回对象数组中最小的成员变量
class Person
{
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name= name;
        this.age= age;
    }
    public static int minAge(Person[] p)    //以对象数组作为参数传递给方法
    {
        int min= Integer.MAX_VALUE;
        for (int i=0;i<p.length;i++)
        {
            if(p[i].age<min)
                min= p[i].age;
        }
        return min;
    }
}
public class App7_14
{
    public static void main(String[] args)
    {
        Person[] per = new Person[3];   //定义对象数组 有3个对象元素
        per[0]=new Person("张三",18);
        per[1]=new Person("李四",19);
        per[2]=new Person("王二",10);
        System.out.println("最小年龄为"+Person.minAge(per));//传递了首地址 只要传递数组名即可
    }
}
