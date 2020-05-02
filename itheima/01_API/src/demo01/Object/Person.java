package demo01.Object;

import java.util.Objects;

public class Person
{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
       /*直接打印对象的地址值没有意义，需要重写Object类中的toString方法
       * 打印对象属性（name,age）*/

  /*  @Override
    public String toString() {
        //return "abccc";
        return "Person{ name= "+ name + "age = " +age+ "}";
    }*/

 /*   @Override//contral+N快捷键自动添加
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

 /*Object类的equals方法，默认比较的是两个对象的地址值，没有意义
 * 所以我们要重写equals方法，比较两个对象的属性（name,age）
 * 问题：
 *      隐含着一个多态
 *      多态的弊端：无法使用子类的特有内容（属性和方法）
 *      Object obj = p2 = new Person("古力娜扎"，19)
 *      解决：可以使用向下转型（强转）把obj类型转换为Person*/

/*    @Override
    public boolean equals(Object obj) {
        //增加一个判断，传递参数obj如果是this本身，直接返回true
        if(obj == this) //提高效率
            return true;
        //增加一个判断，传递的参数obj如果是null,直接返回false
        if(obj==null)   //提高程序效率
            return false;
        //增加一个判断，防止类型转换异常ClassCastException
        if(obj instanceof Person)   //判断一个对象是否是Person类型
        {
            //使用向下转型，把obj转换为Person类型
            Person p = (Person)obj;
            //比较两个对象的属性，一个对象是this（p1）,一个对象是p（obj->p2）
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        //不是Person类型直接返回false
        return false;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass()使用反射技术判断，判断o是否是Person类型 等效于 obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
