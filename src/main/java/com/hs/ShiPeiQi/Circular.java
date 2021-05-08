package com.hs.ShiPeiQi;

/**
 * @author Huasheng
 * @Date 2021/05/08/9:43
 * 方钉
 * @Description
 */
public class Circular {

    private double sideLength;

    public Circular(double sideLength){
        this.sideLength = sideLength;
    }

    public double getSideLength(){
        return sideLength;
    }

    public double getSquare(){
        double result;
        result = Math.pow(this.sideLength,2);
        return result;
    }
}
