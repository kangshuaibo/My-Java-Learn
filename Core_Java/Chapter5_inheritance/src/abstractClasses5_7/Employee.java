package abstractClasses5_7;
import java.time.*;
public class Employee extends Person
{
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)   //构造方法
    {
        super(name);    //调用超类构造器
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary()
    {
        return salary;
    }

     public LocalDate getHireDay()
     {
         return hireDay;
     }

     public String getDescription() //基于抽象基类的抽象方法
     {
         return String.format("an employee with a salary of $%.2f", salary);
     }

     public void raiseSalary(double byPercent)
     {
         double raise = salary * byPercent /100;
         salary += raise;
     }

}
