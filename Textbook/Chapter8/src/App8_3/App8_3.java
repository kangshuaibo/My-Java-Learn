package App8_3;
//在学生子类Student中访问父类Person的成员
class Person
{
    protected String name;
    protected int age;
    public Person(){}   //定义Person类的"不做事"的无参构造方法
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    protected void show()
    {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}

class Student extends Person
{
    private String department;
    int age = 20;   //添加一个与父类同名的成员变量
    public Student(String xm,String dep)    //有参构造方法
    {
        name = xm;
        department = dep;
        super.age = 25; //利用super关键字将父类的成员变量age赋值
        System.out.println("子类Student中的成员变量age="+age);
        super.show();
        System.out.println("系别："+department);
    }
}
public class App8_3
{
    public static void main(String[] args)
    {
        Student stu = new Student("李小四","信息系");
    }
}
