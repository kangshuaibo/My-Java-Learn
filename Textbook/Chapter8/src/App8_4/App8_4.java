package App8_4;
//以个人类Person为父类，创建学生子类Student，并用子类中的方法覆盖父类的方法
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
    protected void show()   //覆盖父类中的同名方法
    {
        System.out.println("系别："+department);
    }

}


public class App8_4
{
  public static void main(String[] args)
  {
    Student stu = new Student("王永涛",24,"电子");
    stu.show(); //父类方法被覆盖 调用的是子类方法而非父类
  }
}
