import java.util.Scanner;

public class Exercises4_2   //评定等级
{
    public static void main(String[] args)
    {
        int n,testScore;
        Scanner reader =new Scanner(System.in);
        System.out.print("请输入一个成绩：");
        testScore=reader.nextInt();
        n=testScore/5;
        if(testScore<60)
            n=11;
        switch(n)
        {
            case 20:
            case 19:
            case 18:
            case 17:
                System.out.println("你的评定成绩为：A");
                break;
            case 16:
            case 15:
            case 14:
                System.out.println("你的评定成绩为：B");
                break;
            case 13:
            case 12:
                System.out.println("你的评定成绩为：C");
                break;
            case 11:
                System.out.println("你的评定成绩为：D");


        }
    }
}
