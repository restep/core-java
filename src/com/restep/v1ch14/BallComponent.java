package com.restep.v1ch14;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author restep
 * @date 2019/3/2
 */
public class BallComponent extends JPanel {
    private List<Ball> ballList = new ArrayList<>();

    public void add(Ball ball) {
        ballList.add(ball);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        for (Ball ball : ballList) {
            graphics2D.fill(ball.getShape());
        }
    }
}
