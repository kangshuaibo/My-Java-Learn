package App12_7;
//利用LinkedList类构造一个先进后出的栈
import java.util.*;
class StringStack
{
    private LinkedList<String>ld = new LinkedList<String>();    //创建linkedlist对象ld
    public void push(String name)   //入栈操作
    {
        ld.addFirst(name);  //将name添加到链表头
    }
    public String pop() //出栈操作
    {
        return ld.removeFirst();    //获取并移出堆栈中的第一个元素
    }
    public boolean isEmpty()    //判断堆栈是否为空
    {
        return ld.isEmpty();
    }
}
public class App12_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringStack stack = new StringStack();
        System.out.println("请输入数据（quit结束）");
        while (true)
        {
            String input = sc.next();   //从键盘输入数据
            if(input.equals("quit"))
                break;
            stack.push(input);  //入栈
        }
        System.out.println("先进后出的顺序：");
        while (!stack.isEmpty())
            System.out.print(stack.pop()+" ");  //出栈
    }
}
