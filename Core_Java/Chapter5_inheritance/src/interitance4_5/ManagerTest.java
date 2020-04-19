package interitance4_5;

public class ManagerTest
{
    public static void main(String[] args)
    {   //构建管理者对象
        Manager boss = new Manager("Carl Cracker", 80000, 1987,12,15);
        boss.setBonus(5000);

        //构建员工对象
        Employee[] staff = new Employee[3];
        staff[0] = boss;    //超类可以引用子类（即使子类的特性多，但多出的方法不能被超类对象调用staff[0].setBouns报错// ）
        staff[1] = new Employee("Harry Hacker", 50000,1989, 10, 1);
        staff[2] = new Employee("Tommy", 40000,1990,3,15);

        //print
        for(Employee e: staff) //超类变量e可以多态调用类或者子类的对象
            System.out.println("name = " + e.getName() + ", salary=" + e.getSalary());

    }
}
