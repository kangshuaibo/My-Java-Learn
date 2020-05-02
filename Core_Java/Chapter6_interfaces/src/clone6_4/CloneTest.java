package clone6_4;


public class CloneTest
{
    public static void main(String[] args)
    {
        try //可能会抛出 clone没有接口没有定义的异常（编译器可能不知道）
        {
            Employee original = new Employee("John Q. Public",50000);
            original.setHireDay(2000,1,1);
            //拷贝原始的对象
            Employee copy = original.clone();
            //对拷贝的对象进行操作 看是否对原对象有影响
            copy.raiseSalary(10);
            copy.setHireDay(2002,12,31);

            System.out.println("original = " + original);
            System.out.println("copy = " + copy);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
