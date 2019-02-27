package com.restep.v1ch06;

import javax.swing.*;

/**
 * @author restep
 * @date 2019/2/27
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

