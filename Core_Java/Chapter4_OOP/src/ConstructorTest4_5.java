import java.util.*;

public class ConstructorTest4_5
{
    public static void main(String[] args)
    {
        //fill
        Employee3[] staff = new Employee3[3];

        staff[0] = new Employee3("Harry", 40000);
        staff[1] = new Employee3(60000);
        staff[2] = new Employee3();

        for(Employee3 e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary()
            );
    }
}

class Employee3
{
    private static int nextId;

    private int id;
    private String name = ""; //实例域初始化
    private double salary;

    //静态初始化块
    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);  //设置初始静态nextid是个10000以下的随机值
    }

    //对象初始化块
    {
        id = nextId;
        nextId++;
    }



    //三个重载构造器
    public Employee3(String n, double s)
    {
        name = n;
        salary = s;
    }

    public Employee3(double s)
    {
        //调用另一个构造器
        this("Employee #" + nextId, s);
    }

    public Employee3()
    {
        //默认构造器 name"" salary 0 id初始化为初始化块
    }





    public String getName() {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }
}
