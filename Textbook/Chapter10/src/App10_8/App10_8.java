package App10_8;
//利用缓冲区输入输出流进行文件复制
import java.io.*;
public class App10_8
{
    public static void main(String[] args)throws IOException
    {
        String str = new String();
        try
        {
            BufferedReader in = new BufferedReader(new FileReader("/Users/kangshuaibo/Desktop/test.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("/Users/kangshuaibo/Desktop/testcopy.txt"));
            while ( (str=in.readLine())!=null)
            {
                System.out.println(str);//在显示器上输出
                out.write(str);//将读取到的一行数据写入到输出流中
                out.newLine();//写入回车换行符
            }
            out.flush();
            in.close();
            out.close();
        }
        catch(IOException ioe)
        {
            System.out.println("错误！"+ioe);
        }
    }
}
