import java.util.Scanner;

public class Exercises5_10      //统计字符串中 所包含的字母 数字 和其他字符个数
{
    public static void main(String[] args)
    {
        String s;
        char c=' ';
        int nDig,nChar,nOther;
        nDig=nChar=nOther=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入字符串：");
        s=reader.nextLine();
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>='a' && c<='z')
                nChar++;
            else if(c>='0'&& c<='9')
                nDig++;
            else
                nOther++;
        }
        System.out.print("字符串中含有字母："+nChar+"个");
        System.out.print("数字有："+nDig+"个");
        System.out.print("其他符号有："+nOther+"个");
    }
}
