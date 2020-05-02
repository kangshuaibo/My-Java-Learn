package timer6_3;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest
{
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();    //构造这个类 传递给构造器

        Timer t = new Timer(10000,listener);//Timer 构造器的第一个参数是发出通告的时间间隔， 它的单位是毫秒。这里希望每隔10秒钟通告一次。第二个参数是监听器对象。
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener //实现接口类
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep(); //默认工具箱 响铃awt包
    }
}
