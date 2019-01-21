package App13_1;
//框架窗口的创建
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
public class App13_1
{
    static JFrame jfrm = new JFrame("这是一个Swing程序");
    public static void main(String[] args)
    {
        JLabel lab = new JLabel("我是一个标签");
        Image im = (new ImageIcon("中国心.jpg")).getImage();
        jfrm.setIconImage(im);
        jfrm.setSize(250,140);
        jfrm.setBackground(Color.YELLOW);
        jfrm.setLocation(260,150);
        jfrm.add(lab);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

    }
}
