package abstractClasses5_7;

public abstract class Person    //抽象基类
{
    public abstract String getDescription();    //抽象方法
    private String name;

    public Person(String name)  //构造方法
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
