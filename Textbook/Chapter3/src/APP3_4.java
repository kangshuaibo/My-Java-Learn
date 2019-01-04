import java.io.*;
public class APP3_4 //从键盘输入数字 然后将其转换成数值形数据
{
    public static void main(String[] args)throws IOException
    {
        float num;
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个实数：");
        str= buf.readLine();    //通过对象调用readline方法将字符串赋值给str
        num=Float.parseFloat(str);  //将str转换成float
        System.out.println("您输入的数为："+num);
    }


}
