package com.hs.ZuHe;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:32
 * 组合图形
 * @Description
 */
public class CompoundShape extends BaseShape{
    protected List<Shape> child = new ArrayList<>();

    public CompoundShape(Shape... components){
        super(0,0, Color.blue);
        add(components);
    }

    public void add(Shape component){
        child.add(component);
    }

    public void add(Shape... components){
        child.addAll(Arrays.asList(components));
    }

    public void remove(Shape children){
        child.remove(children);
    }

    public void clear(){
        child.clear();
    }
    @Override
    public int getX() {
        if (child.size() == 0) {
            return 0;
        }
        int x = child.get(0).getX();
        for (Shape child : child) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (child.size() == 0) {
            return 0;
        }
        int y = child.get(0).getY();
        for (Shape child : child) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (Shape child : child) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (Shape child : child) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        for (Shape child : child) {
            child.move(x, y);
        }
    }
}