package com.hs.ZuHe;

import com.hs.WaiGuan.Codec;

import java.awt.*;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:25
 * @Description
 */
public class Square extends BaseShape{
    public int radius;

    public Square(int x, int y, Color color){
        super(x,y,color);
        this.radius = radius;
    }

    @Override
    public int getWidth(){
        return radius * 2;
    }

    @Override
    public int getHeight(){
        return radius * 2;
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.drawOval(x,y,getWidth() - 1,getHeight() - 1);
    }
}
