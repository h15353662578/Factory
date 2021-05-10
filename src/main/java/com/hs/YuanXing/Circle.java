package com.hs.YuanXing;

import java.util.Objects;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:53
 * 简单形状 圆形
 * @Description
 */
public class Circle extends Shapes{
    public int radius;

    public Circle(){}

    public Circle(Circle target){
        super(target);
        if (target != null){
            this.radius = target.radius;
        }
    }

    @Override
    public Shapes clone(){
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Circle) || !super.equals(object2))
            return false;
        Circle shapes2 = (Circle) object2;
        return shapes2.radius == radius;
    }
}
