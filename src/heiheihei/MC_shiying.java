package heiheihei;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.net.InetAddress;
import java.util.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;



    public class MC_shiying {
        private static Robot robot;
        public static void main(String[] args) {
            try {
                robot = new Robot();//创建Robot对象
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Scanner amount = new Scanner(System.in);
            System.out.println("cishu");
            int count=amount.nextInt();
            System.out.println("输入您要购买的石英块组数并按回车(一背包36组)");
            int a = amount.nextInt();
            int n = a * 4 ;
            Scanner speed = new Scanner(System.in);
            System.out.println("输入速度并按回车，从1-10由快到慢（推荐速度2），请勿输入负数");
            System.out.println("按回车后请在五秒内返回游戏界面保持输入法为英文并按F11全屏");
            int b = speed.nextInt();
            System.out.println("将购买" + a + "组石英块，速度为" + b + "将于五秒后开始购买");
            int t = 70 + b * 30;
            //waiting
            robot.delay(5000);
            //OPEN MENU
            for (int j=0;j<count;j++){
            robot.keyPress(KeyEvent.VK_T);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_T);
            robot.delay(50);
            robot.keyPress(KeyEvent.VK_DIVIDE);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_DIVIDE);
            robot.delay(50);
            robot.keyPress(KeyEvent.VK_M);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_M);
            robot.delay(50);
            robot.keyPress(KeyEvent.VK_E);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_E);
            robot.delay(50);
            robot.keyPress(KeyEvent.VK_N);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_N);
            robot.delay(50);
            robot.keyPress(KeyEvent.VK_U);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_U);
            robot.delay(50);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(500);
            //click system shop
            robot.mouseMove(550, 300);
            robot.delay(300);
            robot.mousePress(KeyEvent.BUTTON1_MASK);
            robot.delay(20);
            robot.mouseRelease(KeyEvent.BUTTON1_MASK);
            robot.delay(500);

            //loop
            for (int i = 0; i < n; i = i + 1) {
                //click sell shop
                robot.mouseMove(750, 290);
                robot.delay(t);
                robot.mousePress(KeyEvent.BUTTON1_MASK);
                robot.delay(20);
                robot.mouseRelease(KeyEvent.BUTTON1_MASK);
                robot.delay(t);
                //click item
                robot.mouseMove(880, 380);//item location
                robot.delay(t);
                robot.mousePress(KeyEvent.BUTTON1_MASK);
                robot.delay(20);
                robot.mouseRelease(KeyEvent.BUTTON1_MASK);
                robot.delay(t);
            }
                robot.keyPress(KeyEvent.VK_ESCAPE);
                robot.delay(20);
                robot.keyRelease(KeyEvent.VK_ESCAPE);//退出商店
                robot.delay(300);
                robot.mousePress(KeyEvent.BUTTON3_MASK);
                robot.delay(20);
                robot.mouseRelease(KeyEvent.BUTTON3_MASK);//右键箱子
                robot.delay(1000);
                robot.mouseMove(550, 750);//移到第一个
                robot.delay(100);
                robot.mousePress(KeyEvent.BUTTON1_MASK);
                robot.delay(20);
                robot.mouseRelease(KeyEvent.BUTTON1_MASK);//左键
                robot.delay(40);
                robot.keyPress(KeyEvent.VK_SHIFT);//按住shift
                robot.delay(100);
                robot.mouseMove(620, 750);//移到第二个
                robot.delay(300);
                robot.mousePress(KeyEvent.BUTTON1_MASK);//双击
                robot.delay(20);
                robot.mouseRelease(KeyEvent.BUTTON1_MASK);
                robot.delay(40);
                robot.mousePress(KeyEvent.BUTTON1_MASK);
                robot.delay(20);
                robot.mouseRelease(KeyEvent.BUTTON1_MASK);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.delay(20);
                robot.mouseMove(1000, 340);//移到上面
                robot.delay(150);
                robot.mousePress(KeyEvent.BUTTON1_MASK);//左键
                robot.delay(20);
                robot.mouseRelease(KeyEvent.BUTTON1_MASK);
                robot.delay(20);
                robot.keyPress(KeyEvent.VK_ESCAPE);//tuichu
                robot.delay(20);
                robot.keyRelease(KeyEvent.VK_ESCAPE);
                robot.delay(500);
//                robot.keyPress(KeyEvent.VK_T);
//                robot.keyRelease(KeyEvent.VK_T);
                robot.keyPress(KeyEvent.VK_A);//
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.delay(50);
                robot.keyRelease(KeyEvent.VK_SPACE);
                robot.delay(2000);
                robot.keyRelease(KeyEvent.VK_A);


        }
        }



        }



