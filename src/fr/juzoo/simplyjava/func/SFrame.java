package fr.juzoo.simplyjava.func;

import javax.swing.*;
import java.awt.*;

public class SFrame {
    //get current window title
    public String getTitle() {
        return title;
    }
    //set new window title
    public void setTitle(String title) {
        this.title = title;
    }
    //get current width(size)
    public int getWidth() {
        return width;
    }
    //set width(size)
    public void setWidth(int width) {
        this.width = width;
    }
    //get current height(size)
    public int getHeight() {
        return height;
    }
    //set height(size)
    public void setHeight(int weight) {
        this.height = weight;
    }

    //default window name
    private String title = "SFrame";
    //default width
    private int width = 1080;
    //default height
    private int height = 720;

    public JFrame getSFrame() {
        return SFrame;
    }

    public void setSFrame(JFrame SFrame) {
        this.SFrame = SFrame;
    }

    private JFrame SFrame = new JFrame();

    public Color getBackgroundColor() {
        return color;
    }

    public void setBackgroundColor(Color color) {
        this.color = color;
    }

    private Color color = Color.WHITE;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    private boolean visible = true;

    public SFrame() {
    }
    public void openFrame(){

        SFrame.setSize(this.getWidth(), this.getHeight());
        SFrame.setTitle(this.getTitle());
        SFrame.getContentPane().setBackground(this.getBackgroundColor());
        SFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SFrame.setVisible(this.isVisible());
    }
}
