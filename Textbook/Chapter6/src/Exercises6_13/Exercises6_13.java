//定义一个Student类包含以下内容：变量成员：学号姓名性别班干部否 数学语文英语
//                            成员方法：输入，总分，平均分
package Exercises6_13;


import java.util.Scanner;

class Student
{
    int sum;
    double average;
    //计算总分方法
    int total(int math,int chinese,int english)
    {
        sum=math+chinese+english;
        return sum;
    }
    //计算平局分
    double score()
    {
        average=(double)sum/3;
        return average;
    }
}
public class Exercises6_13
{
    public static void main(String[] args)
    {
        String temp;
        int math=0,chinese=0,english=0,sum,n;
        double average;

        Scanner reader = new Scanner(System.in);    //定义reader对象 读取键盘数据
        Student volu =new Student();        //定义学生类对象 调用其中的方法

        System.out.print("请输入学生人数：");
        n=reader.nextInt();

        String[][] ren = new String[n][4];  //定义数组对象
        for(int i=0;i<ren.length;i++)
        {
            temp=reader.nextLine();
            System.out.println("----------------------------------------");

            //输入信息保存到数组中
            System.out.print("请输入第"+(i+1)+"个学生的学号");
            ren[i][0]=reader.nextLine();

            System.out.print("请输入第"+(i+1)+"个学生的姓名");
            ren[i][1]=reader.nextLine();

            System.out.print("请输入第"+(i+1)+"个学生的性别");
            ren[i][2]=reader.nextLine();

            System.out.print("请输入第"+(i+1)+"个学生是否是班级干部");
            ren[i][3]=reader.nextLine();



            //输入数学语文英语成绩保存到变量中
            System.out.print("请输入第"+(i+1)+"个学生的数学成绩");
            math=reader.nextInt();

            System.out.print("请输入第"+(i+1)+"个学生的语文成绩");
            chinese=reader.nextInt();

            System.out.print("请输入第"+(i+1)+"个学生的数学成绩");
            english=reader.nextInt();


        }
        for(int i=0;i<ren.length;i++)
        {
            System.out.println("学号： "+ren[i][0]);
            System.out.println("姓名： "+ren[i][1]);
            System.out.println("性别： "+ren[i][2]);
            System.out.println("是否班干部： "+ren[i][3]);

            System.out.println("总分是："+volu.total(math,chinese,english));
            System.out.println("平局分是："+volu.score());


        }
    }
}
