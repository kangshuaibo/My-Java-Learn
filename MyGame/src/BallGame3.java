import javax.swing.*;
import java.awt.*;


public class BallGame3 extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x=100;//小求横坐标
    double y=100;//小球纵坐标
    double degree = 3.14/3;  //弧度 此处就是60度


    //画窗口的方法
    public void paint(Graphics g) {
        System.out.println("窗口被画了一666");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);

        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        if (y > 500 - 40 - 30 || y < 40 + 40) {//500是窗口高度 40是桌子边框 30是求的直径 40是上标题卡宽度
            degree = -degree;
        }

        //碰到左右边界
        if (x < 40 || x > 856 - 40 - 30) {
            degree = 3.14 - degree;
        }
    }

    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(400,400);
        setVisible(true);

        //重画窗口 每秒20次
        while(true)
        {
            repaint();
            try{
                Thread.sleep(40);   //40毫秒 大约一秒画20次窗口
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }






    //main方法是程序的入口
    public static void main(String[] args){
        System.out.println("ball游戏测试");
        BallGame3 game =new BallGame3();
        game.launchFrame();
    }
}
