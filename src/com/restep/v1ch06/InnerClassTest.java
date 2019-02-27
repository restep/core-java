package com.restep.v1ch06;

import javax.swing.*;

/**
 * @author restep
 * @date 2019/2/27
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

