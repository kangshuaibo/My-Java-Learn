package arrayList5_11;

import java.util.*;


import javax.swing.plaf.synth.SynthDesktopIconUI;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        //fill
        ArrayList<Employee> staff = new ArrayList<>();  //用ArrayList类初始化对象

        staff.add(new Employee("Carl Craccker", 75000, 1987, 12,15));
        staff.add(new Employee("Harry hacker", 50000,1989,10,1));
        staff.add(new Employee("Tony Tester", 40000,1990,3,15));

        //raise
        for(Employee e : staff)
            e.raiseSalary(5);

        //print
        for(Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }
}
