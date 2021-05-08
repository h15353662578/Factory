package com.hs.ShiPeiQi;

/**
 * @author Huasheng
 * @Date 2021/05/08/9:29
 * @Description
 */
public class Adapter {
    public static void main(String[] args) {
        Square square = new Square(5);
        SquareHole squareHole = new SquareHole(5);
        if (squareHole.fits(square)){
            System.out.println("半径为5的圆钉适配半径为5的圆孔");
        }

        //实例化一个边长为2的正方形
        Circular smallSqCircular = new Circular(2);
        //实例化一个边长为20的正方形
        Circular bigSqCircular = new Circular(20);

        //调用适配器方法
        CircularSquareAdapter smallSqCircularAdapter = new CircularSquareAdapter(smallSqCircular);
        CircularSquareAdapter bigSqCircularAdapter = new CircularSquareAdapter(bigSqCircular);
        if (squareHole.fits(smallSqCircularAdapter)){
            System.out.println("边长为2的正方形可以放入边长为5的圆形孔中");
        }
        if (!squareHole.fits(bigSqCircularAdapter)){
            System.out.println("边长为20的正方形不可以放入边长为5的圆形孔中");
        }
    }
}
