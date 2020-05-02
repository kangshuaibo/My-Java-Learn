package innerClass6_7;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}


class TalkingClock
{
    private int interval;
    private boolean beep;
    public TalkingClock(int interval, boolean beep) //发布通告间隔 开关铃声标志 构造函数
    {
        this.interval = interval;
        this.beep = beep;
    }
    public void start()
    {
        ActionListener listener = new TimePrinter(); //一个TimePrinter类对象
        Timer t = new Timer(interval,listener); //
        t.start();

    }
    public class TimePrinter implements ActionListener  //内部类 重写ActionListener接口
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("At the tone, the time is " + new Date());
            if(beep)    //内部类访问了beep私有域
                Toolkit.getDefaultToolkit().beep();
        }
    }

}


