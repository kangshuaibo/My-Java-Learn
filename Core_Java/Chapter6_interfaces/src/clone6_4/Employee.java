package clone6_4;

import java.util.Date;
import java.util.GregorianCalendar;//日历类

public class Employee implements Cloneable  //Cloneable接口
{
    private String name;    //String类是一个不可变类 没有修改器方法 拷贝引用也安全 共享这个是安全的
    private double salary;
    private Date hireDay;   //通常子对象可变 需要建立深拷贝 对拷贝出来的对象操作不会影响原来的

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }
    //当对象的类并没有实现Cloneable 接口时 会抛出异常，编译器不知道 我们要声明这个异常
    public Employee clone() throws CloneNotSupportedException   //重新定义方法建立深拷贝 先定义成public
    {
        Employee cloned = (Employee) super.clone(); //默认的克隆

        cloned.hireDay = (Date)hireDay.clone(); //补充的克隆 克隆可变实例域

        return cloned;
    }

    public void setHireDay(int year, int month, int day)
    {
        Date newHireDay = new GregorianCalendar(year, month-1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPrecent)
    {
        double raise = salary * byPrecent /100;
        salary += raise;
    }

    public String toString()
    {
        return "Employee[ name = " + name + ", salary = " + salary + ", hireDay = " +hireDay+ "]";
    }
}


