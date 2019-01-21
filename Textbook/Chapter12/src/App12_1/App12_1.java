package App12_1;
//泛型类的定义及应用
public class App12_1 <T>    //定义泛型类 T是类型参数
{
    private T obj;  //定义泛型类成员变量
    public  T getObj()  //定义泛型类的方法getObj()
    {
        return obj;
    }
    public void setObj(T obj)   //定义泛型类的方法setObj()
    {
        this.obj = obj;
    }
    public static void main(String[] args)
    {
        App12_1<String> name = new App12_1<String>();    //创建App12_1<String>型对象
        App12_1<Integer> age = new App12_1<Integer>();   //创建App12_1<Integer>型对象

        name.setObj("陈磊");
        String newName = name.getObj();
        System.out.println("姓名："+newName);

        age.setObj(25); //Java自动将25包装为new Integer(25)
        int newAge = age.getObj();//Java将Integer类型自动解包成int类型
        System.out.println("年龄：" +newAge);
    }
}
