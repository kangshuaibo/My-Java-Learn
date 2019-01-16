package App10_3;
import java.io.*;
//利用数据输入输出流将不同类型数据写到一个文件temp中，然后在读出到显示器上

public class App10_3
{
    public static void main(String[] args)
    {
        FileOutputStream fout;
        DataOutputStream dout; //每次读取4字节
        FileInputStream fin;
        DataInputStream din;

        try
        {
            fout = new FileOutputStream("/Users/kangshuaibo/Desktop/temp");
            dout = new DataOutputStream(fout);
            dout.writeInt(10);
            dout.writeLong(12345);
            dout.writeFloat(3.1415926f);
            dout.writeDouble(987654321.123);
            dout.writeBoolean(true);
            dout.writeChars("GoodBy");
            dout.close();
        }
        catch (IOException e){}

        try
        {
            fin = new FileInputStream("/Users/kangshuaibo/Desktop/temp");
            din = new DataInputStream(fin);
            System.out.println(din.readInt());
            System.out.println(din.readLong());
            System.out.println(din.readFloat());
            System.out.println(din.readDouble());
            System.out.println(din.readBoolean());
            char ch;
            while ( (ch=din.readChar())!='\0')
                System.out.print(ch);
            din.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件未找到！！");
        }
        catch (IOException e) {}

    }
}
