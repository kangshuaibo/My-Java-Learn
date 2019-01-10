package App8_9;
//运算符instanceof及getName、getSuperclass()方法的使用
public class Person
{
    static int count = 0;
    protected String name;
    protected int age;
    public Person(String n1,int a1)
    {
        name = n1;
        age = a1;
        this.count++;
    }
    public String toString()
    {
        return this.name+","+this.age;
    }
    public void display()
    {
        System.out.print("本类名"+this.getClass().getName()+";");
        System.out.println("父类名="+this.getClass().getSuperclass().getName());
        System.out.print("Person.count="+this.count+" ");
        System.out.print("Student.count="+Student.count+"");
        Object obj = this;
        if(obj instanceof Student)  //判断是否是指定类的实例
            System.out.println(obj.toString()+"是Student类对象");
        else if(obj instanceof Person)
            System.out.println(obj.toString()+"是Person类对象.");
    }
}

class Student extends Person
{
    static int count = 0;   //隐藏了父类的count
    protected String dept;
    protected Student(String n1,int a1,String d1)
    {
        super(n1,a1);   //调用父类构造方法
        dept = d1;
        this.count++;
    }
    public String toString()    //调用父类同名方法
    {
        return super.toString()+","+dept;
    }
    public void display()
    {
        super.display();//调用父类方法
        System.out.print("super.count="+super.count);
        System.out.println("  ;this.count="+this.count);
    }
    public static void main(String[] args)
    {
        Person per = new Person("王永涛",23);
        per.display();
        Student stu = new Student("张小三",22,"计算机系");
        stu.display();
    }
}

