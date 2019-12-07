import java.awt.Robot;
import java.io.PrintStream;
import java.util.Scanner;

public class MC_boli {
    private static Robot robot;


    public static void main(String[] args) {
        try {
            robot = new Robot();
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        Scanner amount = new Scanner(System.in);
        System.out.println("次数");
        int bai = amount.nextInt();
        System.out.println("输入您要购买的组数并按回车(一背包36组)");
        int a = amount.nextInt();
        int n = a * 4;
        Scanner speed = new Scanner(System.in);
        System.out.println("输入速度并按回车，从1-10由快到慢（推荐速度2），请勿输入负数");
        System.out.println("按回车后请在五秒内返回游戏界面保持输入法为英文并按F11全屏");
        int b = speed.nextInt();
        PrintStream var10000 = System.out;
        int t = 70 + b * 30;
        robot.delay(5000);

        for(int j = 0; j < bai; ++j) {
            robot.keyPress(84);
            robot.delay(20);
            robot.keyRelease(84);
            robot.delay(50);
            robot.keyPress(111);
            robot.delay(20);
            robot.keyRelease(111);
            robot.delay(50);
            robot.keyPress(77);
            robot.delay(20);
            robot.keyRelease(77);
            robot.delay(50);
            robot.keyPress(69);
            robot.delay(20);
            robot.keyRelease(69);
            robot.delay(50);
            robot.keyPress(78);
            robot.delay(20);
            robot.keyRelease(78);
            robot.delay(50);
            robot.keyPress(85);
            robot.delay(20);
            robot.keyRelease(85);
            robot.delay(50);
            robot.keyPress(10);
            robot.delay(20);
            robot.keyRelease(10);
            robot.delay(500);
            robot.mouseMove(550, 300);
            robot.delay(300);
            robot.mousePress(16);
            robot.delay(20);
            robot.mouseRelease(16);
            robot.delay(500);

            for(int i = 0; i < n; ++i) {
                robot.mouseMove(750, 290);
                robot.delay(t);
                robot.mousePress(16);
                robot.delay(20);
                robot.mouseRelease(16);
                robot.delay(t);
                robot.mouseMove(550, 360);
                robot.delay(t);
                robot.mousePress(16);
                robot.delay(20);
                robot.mouseRelease(16);
                robot.delay(t);
                robot.mouseMove(550, 300);
                robot.delay(300);
                robot.mousePress(16);
                robot.delay(20);
                robot.mouseRelease(16);
                robot.delay(500);
            }

            robot.keyPress(27);
            robot.delay(20);
            robot.keyRelease(27);
            robot.delay(300);
            robot.mousePress(4);
            robot.delay(20);
            robot.mouseRelease(4);
            robot.delay(1000);
            robot.mouseMove(550, 750);
            robot.delay(100);
            robot.mousePress(16);
            robot.delay(20);
            robot.mouseRelease(16);
            robot.delay(40);
            robot.keyPress(16);
            robot.delay(100);
            robot.mouseMove(620, 750);
            robot.delay(300);
            robot.mousePress(16);
            robot.delay(20);
            robot.mouseRelease(16);
            robot.delay(40);
            robot.mousePress(16);
            robot.delay(20);
            robot.mouseRelease(16);
            robot.delay(100);
            robot.keyRelease(16);
            robot.delay(20);
            robot.mouseMove(1000, 340);
            robot.delay(150);
            robot.mousePress(16);
            robot.delay(20);
            robot.mouseRelease(16);
            robot.delay(20);
            robot.keyPress(27);
            robot.delay(20);
            robot.keyRelease(27);
            robot.delay(500);
            robot.keyPress(65);
            robot.delay(100);
            robot.keyPress(32);
            robot.delay(50);
            robot.keyRelease(32);
            robot.delay(2000);
            robot.keyRelease(65);
        }

    }
}
