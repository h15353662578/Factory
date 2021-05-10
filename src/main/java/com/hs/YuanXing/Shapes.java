package com.hs.YuanXing;

import java.util.Objects;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:48
 * shapes 形状列表
 * cloneable 克隆接口实现克隆
 * @Description
 */
public abstract class Shapes {

    public int x,y;
    public String color;

    public Shapes(){}

    public Shapes(Shapes target){
        if (target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shapes clone();

    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Shapes))
            return false;
        Shapes shapes2 = (Shapes) object2;
        return shapes2.x == x && shapes2.y == y && Objects.equals(shapes2.color,color);
    }
}
