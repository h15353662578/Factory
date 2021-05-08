package com.hs.ShiPeiQi;

/**
 * @author Huasheng
 * @Date 2021/05/08/9:37
 * 圆孔
 * @Description
 */
public class SquareHole {

    //圆孔半径
    private double radius;

    public SquareHole(double radius){
        this.radius = radius;
    }

    //取圆孔半径
    public double getRadius(){
        return radius;
    }

    //契合方法
    public boolean fits(Square square){
        boolean result;
        result = (this.getRadius() >= square.getRadius());
        return result;
    }
}
