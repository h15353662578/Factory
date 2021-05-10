package com.hs.ZuHe;

import java.awt.*;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:23
 * 点
 * @Description
 */
public class Dot extends BaseShape{

    private final int DOT_SIZE = 3;

    public Dot(int x, int y,Color color){
        super(x,y,color);
    }

    @Override
    public int getWidth(){
        return DOT_SIZE;
    }

    @Override
    public int getHeight(){
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.fillRect(x - 1,y - 1,getWidth(),getHeight());
    }
}
