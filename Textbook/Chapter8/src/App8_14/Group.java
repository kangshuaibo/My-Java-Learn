package App8_14;
//内部类与外部类的访问规则
public class Group
{
    private int age;

    public class  Student   //声明内部类
    {
        String name;
        public Student(String n,int a)
        {
            name = n;
            age = a;
        }
        public void output()//定义内部类成员方法
        {
            System.out.println("姓名："+this.name+"年龄："+age);
        }
    }

    public void output()//定义外部类成员方法
    {
        Student stu = new Student("刘洋",24);
        stu.output();//调用内部类的成员方法
    }

    public static void main(String[] args)
    {
        Group g = new Group();
        g.output();//   调用外部类的方法
    }
}
