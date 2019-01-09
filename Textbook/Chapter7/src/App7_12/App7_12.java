package App7_12;
//创建人类Person 在该类中定义一个对象作为返回值的方法compare()
class Person
{
    private String name;
    private int age;
    public Person(String name,int age)  //构造方法
    {
        this.name=name; //this调用类中的构造方法
        this.age=age;
    }
    public Person compare(Person p)
    {
        if(this.age>p.age)
            return this;//返回该方法的对象
        else
            return p;
    }



}
public class App7_12
{
    public static void main(String[] args)
    {
        Person per1 = new Person("张三",20);
        Person per2 = new Person("李四",20);
        Person per3;//定义一个类变量
        per3 = per1.compare(per2);  //per3指向per1对象
        if(per3==per1)
            System.out.println("张三年龄大");
        else
            System.out.println("李四年龄大");
    }
}
