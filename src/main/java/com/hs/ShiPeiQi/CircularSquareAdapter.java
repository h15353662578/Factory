package com.hs.ShiPeiQi;

/**
 * @author Huasheng
 * @Date 2021/05/08/9:27
 * 适配器允许将正方形按到圆孔中
 * @Description
 */
public class CircularSquareAdapter extends Square{

    private Circular circular;

    public CircularSquareAdapter(Circular circular){
        this.circular = circular;
    }


    public double getRadius(){
        double result;
        //计算一个最小圆半径可以适配这个正方形
        result = (Math.sqrt(Math.pow((circular.getSideLength() / 2), 2) *2));
        return result;
    }
}
