import java.util.*;
public class Exercises5_9   //从键盘输入一个字符串和一个字符，从字符串中删掉该字符
{
    public static void main(String[] args)throws Exception
    {
        String str,newStr="";
        char sChar,cChar;
        int n;
        Scanner buf= new Scanner(System.in);
        System.out.print("输入字符串:");
        str=buf.nextLine();

        System.out.print("输入要删除的字符：");
        sChar=(char)System.in.read();

        n=str.length();
        for(int i=0;i<n;i++)    //遍历字符串 逐个与要删除的字符串比较 不相等的放到newStr中 相等的不操作
        {
            cChar=str.charAt(i);    //cChar为临时保存遍历的字符串的变量
            if(cChar!=sChar)
                newStr=newStr+cChar;//sChar为要删除的字符
        }
        System.out.print("新字符串是："+newStr);


    }
}
