package com.hs.ZuHe;

import java.awt.*;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:09
 * 通用形状接口
 * @Description
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x,int y);
    void select();
    void unSelect();
    boolean isSelect();
    void paint(Graphics graphics);
}
