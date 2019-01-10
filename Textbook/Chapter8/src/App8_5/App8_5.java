package App8_5;
//利用父类Person的对象 调用子类Student中的成员
class Person
{
    protected String name;
    protected int age;
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    protected void show()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}
class Student extends Person
{
    private String department;
    public Student(String name,int age,String dep)
    {
        super(name,age);
        department = dep;
    }
    protected void show()   //测试1
    {
        System.out.println("系列："+department);
    }
    public void subShow()   //测试被父类调用的方法 一个为protected 一个为public
    {
        System.out.println("我在子类中");
    }
}
public class App8_5
{
    public static void main(String[] args)
    {
        Person per = new Student("王江涛",18,"信息");
        per.show(); //利用父类的对象per调用show方法
        //per.subShow();
    }
}
