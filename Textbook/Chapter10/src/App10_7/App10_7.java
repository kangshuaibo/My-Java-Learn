package App10_7;
//利用缓冲字符输入流类BufferedReader读取文本文件
import java.io.*;
public class App10_7
{
    public static void main(String[] args) throws IOException
    {
        String thisLine;
        int count  = 0;
        try
        {
            FileReader fr = new FileReader("/Users/kangshuaibo/Desktop/test.txt");
            BufferedReader bfr=new BufferedReader(fr);
            while ( (thisLine=bfr.readLine())!=null)    //每次读取一行
            {
                count++;    //计算读取的行数
                System.out.println(thisLine);
            }
            System.out.println("共读取了"+count+"行");
            bfr.close();
        }
        catch (IOException ioe)
        {
            System.out.println("错误！"+ioe);
        }
    }
}
