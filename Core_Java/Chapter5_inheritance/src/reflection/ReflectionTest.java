package reflection;

import java.util.*;
import java.lang.reflect.*;     //包中有三个类Field、Method 和Constructor 分别用于描述类的域、方法和构造器。

public class ReflectionTest
{

    public static void main(String[] args)
    {
        //read class name
        String name;
        if (args.length > 0)
            name = args[0];
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("enter class name:(e.g. java.util.Date):");
            name = in.next();
        }

        try
        {
            //print class name and superclass name(if !=Object)
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();

            String modifiers = Modifier.toString(cl.getModifiers());

            if(modifiers.length()>0)
                System.out.print(modifiers + " ");
            System.out.print("class " + name);

            if(supercl != null && supercl != Object.class)
                System.out.print("extends " + supercl.getName());

            System.out.print("\n{\n");

            System.out.println("constructors：" );
            printConstructors(cl);
            System.out.println("methods：");
            printMethods(cl);
            System.out.println("fields：");
            printFields(cl);

            System.out.println("}");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.exit(0);
    }


    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors(); //reflect包中的 constructor类：get方法返回类中声明的全部构造器

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("  ");

            //修改器 即public private
            String modifires = Modifier.toString(c.getModifiers());//reflect包中的 Modifier类 描述public static等的 修饰符状态
            if (modifires.length() > 0)
                System.out.print(modifires + " ");

            System.out.print(name + "(");
            //打印参数类型
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0)
                    System.out.print(",");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }


    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods)
        {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("  ");
            //print modifiers即 double int等
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length()> 0)
                System.out.print(retType.getName() + " " + name + "(");
            //print parameter
            Class[] paramTypes = m.getParameterTypes();
            for (int j= 0; j<paramTypes.length;j++)
            {
                if(j>0)
                    System.out.print(",");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");

        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");

            //即打印：public static final double POSITIVE_INFINITY等域
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }

}