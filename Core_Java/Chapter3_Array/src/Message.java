import java.util.*;

public class Message
{
    public static void main(String[] args)  //如果使用下面这种形式运行这个程序：java Message -g cruel world 需要进入编译后的class目录
    {
        if (args.length == 0 || args[0].equals("_h"))
        System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print ("Goodbye,");
            // print the other command-line arguments
        for (int i = 1; i < args.length; i ++)
            System.out.print(" " + args[i]);
        System.out.println("!") ;
    }
}

/*
java Message -g cruel world

args[0]:"-g"    注意这里是-g而不是message
args[l]:"cruel"
args[2]:"world"
*/
