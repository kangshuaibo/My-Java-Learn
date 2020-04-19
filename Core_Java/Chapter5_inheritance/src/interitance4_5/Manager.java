package interitance4_5;

public class Manager extends Employee   //子类
{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);  //调用超类的构造器
        bonus = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();  //调用超类方法
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }
}
