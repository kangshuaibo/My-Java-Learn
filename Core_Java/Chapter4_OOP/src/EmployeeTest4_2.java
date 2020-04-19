import java.time.*;

public class EmployeeTest4_2    //在一个源文件中只能有一个公有类
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester" , 40000, 1990, 3 , 15);

        //raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        //print
        for (Employee e : staff)
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary()
            + ", hireDay = " + e.getHireDay());



    }
}



class Employee  //可以有任意数量的非公有类
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
