package App10_6;
//利用FileWriter类将字符数组与字符串写到文件中
import java.io.*;
public class App10_6
{
    public  static void main(String[] args) throws IOException//write方法可能抛出异常
    {
        FileWriter fw = new FileWriter("/Users/kangshuaibo/Desktop/test.txt");
        char[] c = {'H','e','L','L','o','\r','\n'}; //这是回车
        String str = "欢迎使用Java";
        fw.write(c);    //将字符数组写到文件里
        fw.write(str);  //将字符串写到文件里
        fw.close();
    }
}
