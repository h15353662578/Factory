package com.hs.ZuHe;

import java.awt.*;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:13
 * @Description
 */
public class BaseShape implements Shape{

    public int x,y;

    public Color color;

    private boolean selected = false;

    BaseShape(int x ,int y,Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void select() {
        selected = true;
    }

    @Override
    public void unSelect() {
        selected = false;
    }

    @Override
    public boolean isSelect() {
        return selected;
    }

    void enableSelectionStyle(Graphics graphics){
        graphics.setColor(Color.LIGHT_GRAY);
        Graphics2D graphics2D = (Graphics2D) graphics;
        float dash[] = {2.0f};
        graphics2D.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f,dash,0.0f));
    }

    void disableSelectionStyle(Graphics graphics){
        graphics.setColor(color);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setStroke(new BasicStroke());
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelect()){
            enableSelectionStyle(graphics);
        }else {
            disableSelectionStyle(graphics);
        }
    }
}
