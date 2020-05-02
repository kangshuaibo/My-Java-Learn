package anonymouslnnerClass6_8;

import java.awt.*;
import java.awt.event.*;    //ActionListener接口
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class AnonymousInnerClassTest
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock();
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"退出？");
        System.exit(0);
    }
}

class TalkingClock
{
    public void start(int interval,boolean beep)
    {
        ActionListener listener = new ActionListener(){//匿名内部类 只创建了这个类的一个对象（以前是TimePrinter）
            public void actionPerformed(ActionEvent event)  //重写接口的方法
            {
                System.out.println("At the tone, the time is " + new Date());   //打印目前时间
                if(beep)
                    Toolkit.getDefaultToolkit().beep(); //响铃
            }
        };

        Timer t = new Timer(interval,listener);
        t.start();
    }

}
/*
    public void start (int interval , boolean beep)
        {
        Timer t = new Timer(interval , event ->
            {
                System.out.println("At the tone, the time is " + new Date());
                if (beep)
                    Toolkit.getDefaultToolkit().beep();
            }  );
        t.start();
*/