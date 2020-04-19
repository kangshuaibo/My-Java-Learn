package abstractClasses5_7;

public class PersonTest {
    public static void main(String[] args)
    {
        Person[] people = new Person[2];    //抽象超类的对象变量 只能引用子类对象

        //fill
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        //print
        for(Person p : people)
            System.out.println(p.getName() + "," + p.getDescription());
    }
}
