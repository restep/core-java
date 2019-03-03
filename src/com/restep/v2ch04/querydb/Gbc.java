package com.restep.v2ch04.querydb;

import java.awt.*;

/**
 * @author restep
 * @date 2019/3/3
 */
public class Gbc extends GridBagConstraints {
    public Gbc(int gridx, int gridy) {
        this.gridx = gridx;
        this.gridy = gridy;
    }

    public Gbc(int gridx, int gridy, int gridwidth, int gridheight) {
        this.gridx = gridx;
        this.gridy = gridy;
        this.gridwidth = gridwidth;
        this.gridheight = gridheight;
    }

    public Gbc setAnchor(int anchor) {
        this.anchor = anchor;
        return this;
    }

    public Gbc setFill(int fill) {
        this.fill = fill;
        return this;
    }

    public Gbc setWeight(double weightx, double weighty) {
        this.weightx = weightx;
        this.weighty = weighty;
        return this;
    }

    public Gbc setInsets(int distance) {
        this.insets = new Insets(distance, distance, distance, distance);
        return this;
    }

    public Gbc setInsets(int top, int left, int bottom, int right) {
        this.insets = new Insets(top, left, bottom, right);
        return this;
    }

    public Gbc setIpad(int ipadx, int ipady) {
        this.ipadx = ipadx;
        this.ipady = ipady;
        return this;
    }
}
