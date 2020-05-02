package interfaces6_1;

import org.w3c.dom.DOMImplementation;

public class Employee implements Comparable<Employee>
{
    private String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent /100;
        salary += raise;
    }

    public int compareTo(Employee other)     //Array类中的sort方法有接口
    {
        return Double.compare(salary,other.salary);
    }

}
