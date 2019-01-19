package Exercises10_10;
import java.util.Random;
import java.util.Arrays;
import java.io.*;
//产生15个20～9999之间的随机整数，然后利用BufferedWriter类将其写入文件file.txt2中
public class Exercises10_10
{
    public static void main(String[] args)throws IOException
    {
        Random rand = new Random(); //Random类在java.util包中
        //产生随机数存到数组 然后写到文件上
        BufferedWriter output = new BufferedWriter(new FileWriter("file2.txt"));
        int[] num1 = new int[15];
        for (int i=0;i<num1.length;i++)
        {
            num1[i]=20+rand.nextInt(9979);//生成20～9999的随机整数赋值给num1[i]
            //写到文件上
            output.write(num1[i]+"");
            output.newLine();
        }

        output.close();

        //从文件读取 存到数组
        BufferedReader input = new BufferedReader(new FileReader("file2.txt"));
        int[] num2 = new int[15];
        for(int i=0;i<num2.length;i++)
            num2[i]=Integer.parseInt(input.readLine());

        input.close();

        //显示到屏幕上
        Arrays.sort(num2);
        for(int i=0;i<num2.length;i++)
            System.out.println(num2[i]);
    }
}
