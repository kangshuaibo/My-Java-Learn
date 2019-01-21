package App13_2;
import javax.swing.*;
import javax. swing.border.TitledBorder;   //加载 Javax. swIng包里的所有类
public class App13_2
{

    public static void main(String[] args)
    {

        JFrame jfrm= new JFrame("我的框架");
        jfrm.setSize(210,180);
        jfrm.setLocation(500,400);
        JPanel jpan = new JPanel();
        jpan.setSize(120,90);
        jpan.setLocation(40,30);
        JButton bun = new JButton("点击我");
        bun.setSize(80,20);
        bun.setLocation(20,30);
        jfrm.setLayout(null);
        jpan.setLayout(null);
        jpan.add(bun);
        jpan.setBorder(new TitledBorder("面板区"));
        jfrm.add(jpan);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);


    }

}


