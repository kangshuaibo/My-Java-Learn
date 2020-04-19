package enums5_12;

import java.util.*;

public class EnumTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");

        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);    //toString的 逆静态方法 size设置成Size.SMALL

        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());   //缩写

        if(size == Size.EXTRAA_LARGE)
            System.out.println("Good job--you paid attention to the_.");

    }
}


enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRAA_LARGE("XL"); //对象

    private String abbreviation;

    private Size(String abbreviation)   //构造器
    {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation()
    {
        return abbreviation;
    }

}