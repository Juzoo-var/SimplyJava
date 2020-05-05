package fr.juzoo.simplyjava.func;

import javax.swing.*;

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

    public int getWeight() {
        return height;
    }

    public void setHeight(int weight) {
        this.height = weight;
    }

    private String title = "SFrame";
    private int width = 1080;
    private int height = 720;

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
        JFrame SFrame = new JFrame();
        SFrame.setSize(this.getWidth(), this.getWeight());
        SFrame.setTitle(this.getTitle());
        SFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SFrame.setVisible(this.isVisible());
    }
}
