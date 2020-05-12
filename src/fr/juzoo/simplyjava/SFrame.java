package fr.juzoo.simplyjava;

import javax.swing.*;
import java.awt.*;

public class SFrame {
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int weight) {
        this.height = weight;
    }
    private String title = "SFrame";
    private int width = 1080;
    private int height = 720;
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
