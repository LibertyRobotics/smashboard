package org.usfirst.frc.falcons6443.smashboard;

import org.usfirst.frc.falcons6443.smashboard.widgets.Widget;

import java.awt.*;

/**
 * @author Shivashriganesh Mahato
 */
public class Smashboard {

    private Dashboard smashboard;

    private Smashboard(String ipAddress, String nTableKey, String title, Color bgColor, boolean isResizable, int width,
                       int height) {
        smashboard = new Dashboard(ipAddress, nTableKey, title, bgColor, isResizable, width, height);
    }

    private void init() {
        smashboard.addData("leftVal",
                new Widget("/img/BarSide.png", 0, 140, 75, 500));
        smashboard.addData("rightVal",
                new Widget("/img/BarSide.png", 853, 140, -75, 500));
        smashboard.init();
        smashboard.run();
    }

    private void loop() {
        while (true) {
            smashboard.update();
        }
    }

    public static void main(String[] args) {
        Smashboard mySmashboard = new Smashboard("10.64.43.62", "smashboard", "Smashboard",
                Color.BLACK, false, 853, 640);
        mySmashboard.init();
        mySmashboard.loop();
    }
 
}
