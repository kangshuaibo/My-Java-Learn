import com.hosrtmann.corejava.*;
import static java.lang.System.*;

class PackageTest4_6
{
    public static void main(String[] args)
    {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        out.println("name=" + harry.getName());
    }
}
