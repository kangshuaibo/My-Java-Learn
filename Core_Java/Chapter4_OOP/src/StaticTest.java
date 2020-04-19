
public class StaticTest
{
    public static void main(String[] args)
    {
        //fill
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Tom", 40000);
        staff[1] = new Employee2("Dick", 60000);
        staff[2] = new Employee2("Harry",65000);

        //print
        for(Employee2 e: staff)
        {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" +e.getId() + ",salary=" + e.getSalary());
        }
    }
}

class Employee2
{
    private static int nextId = 1;  //静态变量 类变量 属于这个类 不属于任何对象
    private String name;
    private double salary;
    private int id; //属于一个对象的变量

    public Employee2( String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName()
    {
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

    public void setId()
    {
        id = nextId;    //用静态变量赋值给对象的变量
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;
    }

    public static void main(String[] args)  //单元测试
    {
        Employee2 e = new Employee2("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}


