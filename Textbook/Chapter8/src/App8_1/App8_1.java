package App8_1;
//类的继承，创建个人类Person，再以该类为父类创建一个学生子类Student
class Person
{
    private String name;
    private  int age;
    public Person()
    {
        System.out.println("调用了个人类的构造方法Person()");
    }
    public void setNameAge(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void show()
    {
        System.out.println("姓名："+name+"     年龄："+age);
    }
}




class Student extends Person
{
    private String department;
    public Student()    //定义构造方法
    {
        System.out.println("调用了学生类的构造方法Student()");
    }
    public void setDepartment(String dep)
    {
        department = dep;
        System.out.println("我是"+department+"的学生");
    }
}



public class App8_1
{
    public static void main(String[] args)
    {
        Student stu = new Student();
        stu.setNameAge("张小三",21);       //调用从父类继承而来的setName和show方法
        stu.show();
        stu.setDepartment("计算机系");
    }
}
