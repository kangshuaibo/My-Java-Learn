package App10_10;
//利用RandomAccessFile类对文件进行随机访问
import java.io.*;
public class App10_10
{
    public static void main(String[] args)throws IOException
    {   //接收用户从键盘输入的路径名 存放到stfDir
        StringBuffer stfDir = new StringBuffer();
        System.out.println("请输入文件所在路径");
        char ch;
        while ( (ch=(char)System.in.read())!='\n')//从键盘读
            stfDir.append(ch);//把任何类型数据的字符串表示连接到 调用stringbuffer的末尾，即stfDir的末尾
        File dir = new File(stfDir.toString()); //利用所输入的字符串为参数创建一个 File类对象dir

        //接收用户从键盘输入的文件名 存放到stfFileName
        System.out.println("请输入欲读取的文件名");
        StringBuffer stfFileName = new StringBuffer();
        char c;
        while ( (c=(char)System.in.read())!='\n')//从键盘读
            stfFileName.replace(0,1,""); //去掉上次输入回车后存留在缓冲区中的"\n"
        File readFrom = new File(dir,stfFileName.toString());//以路径和文件名创建 File对象readFrom

        //创建可随机访问文件对象
        if(readFrom.isFile() && readFrom.canWrite() && readFrom.canRead())
        {
            RandomAccessFile rafFile = new RandomAccessFile(readFrom,"rw"); //以File类为参 创建可随机访问的文件对象
            while ( rafFile.getFilePointer() < rafFile.length() )//指针位置没有超过文件长度
                System.out.println(rafFile.readLine());
            rafFile.close();
        }
        else
            System.out.println("文件不可读");

    }
}
/*运行结果:
        请输入文件所在路径
        /Users/kangshuaibo/Desktop/zyb/aaa.txt
        请输入欲读取的文件名
        aaa.txt
        Afadfaafdaf
*/

