import java.util.*;
public class Exercises4_1   //将学生的学习成绩按不同分数段分为 优、良、中、不及格和及格五个等级。从键盘输入一个0～100的成绩，输出相应的等级用switch语句实现
{
    public static void main(String[] args)
    {
        int testScore,x;
        char grade;
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入成绩");
        testScore=reader.nextInt();
        x=testScore/10;
        switch (x)
        {
            case 10:
            case 9:
                grade='A';
                break;
            case 8:
                grade='B';
                break;
            case 7:
                grade='C';
                break;
            case 6:
                grade='D';
                break;
                default:
                    grade='E';

        }
        System.out.println("评定成绩为："+grade);
    }

}
