package com.hs.YuanXing;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:56
 * 简单形状 三角形
 * @Description
 */
public class Rectangle extends Shapes{

    public int width;
    public int height;

    public Rectangle(){}
    public Rectangle(Rectangle target){
        super(target);
        if (target != null){
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shapes clone(){
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Rectangle) || !super.equals(object2))
            return false;
        Rectangle shapes2 = (Rectangle) object2;
        return shapes2.width == width && shapes2.height == height;
    }
}
