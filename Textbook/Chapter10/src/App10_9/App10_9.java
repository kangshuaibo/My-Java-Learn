package App10_9;

import java.io.*;

//创建File类对象，输出指定文件夹下内容
public class App10_9
{
    public static void main(String[] args) throws IOException
    {
        try
        {   //先创建对象指向文件夹
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader inp = new BufferedReader(isr);//缓冲输入流读取文件
            String sdir = "/Users/kangshuaibo/Desktop/zyb";
             String sfile;   //存放从键盘读取
            File fdir1 = new File(sdir);    //sdir是文件路径

            //当文件夹存在时 输出所有文件和子文件夹
            if( fdir1.exists() && fdir1.isDirectory() ) //判断是否存在 判断对象是否代表有效文件夹
            {   //直接显示
                System.out.println("文件夹："+sdir+"已经存在");
                for(int i=0;i<fdir1.list().length;i++)  //list是文件夹下的文件名
                    System.out.println((fdir1.list())[i]);
                //不存在则创建
                File fdir2=new File("/Users/kangshuaibo/Desktop/zyb");
                if(!fdir2.exists())
                    fdir2.mkdir();//创建当前文件夹的子文件夹

                System.out.println();
                //显示创建后
                System.out.println("建立新文件夹后的文件列表");
                for(int i=0;i<fdir1.list().length;i++)
                    System.out.println((fdir1.list())[i]);

            }

            //输入 指定文件夹名称 显示信息
            System.out.print("请输入该文件夹中的一个文件名：");
            sfile=inp.readLine();   //从键盘上读取数据
            File ffile = new File(fdir1,sfile); //参数是文件路径和文件名
            if(ffile.isFile())
            {
                System.out.print("文件名："+ffile.getName());
                System.out.print(";坐在文件夹："+ffile.getPath());
                System.out.println(";文件大小："+ffile.length()+"字节");
            }
            if(inp!=null)
                inp.close();
        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }
    }
}

//在文件存在的情况下
