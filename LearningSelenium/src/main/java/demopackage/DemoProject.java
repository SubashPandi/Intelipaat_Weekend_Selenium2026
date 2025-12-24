package demopackage;

import java.awt.*;
import java.util.Random;

public class DemoProject {
    public static void main(String[] args) throws Throwable {


        int Time = 30000;
        int MAX_Y = 400;
        int MAX_X = 400;
        System.setProperty("java.awt.headless", "false");
        Robot robot = new Robot();
        Random random = new Random();

        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(Time);
        }
    }
}
