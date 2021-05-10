package com.hs.YuanXing;

/**
 * @author Huasheng
 * @Date 2021/05/10/15:23
 * @Description
 */
public class Clone {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();
        Shapes shapes1 = cache.get("大绿圆");
        Shapes shapes2 = cache.get("中蓝三角形");
        Shapes shapes3 = cache.get("中蓝三角形");

        if (shapes1 != shapes2 && !shapes1.equals(shapes2)){
            System.out.println("大绿圆不等于中蓝三角形");
        }else {
            System.out.println("大绿圆等于中蓝三角形");
        }

        if (shapes2 != shapes3){
            System.out.println("两个不同的对象");
            if (shapes2.equals(shapes3)){
                System.out.println("图形二和图形三是一样的图形");
            }else {
                System.out.println("这是不同的图形");
            }
        }else {
            System.out.println("三角形克隆了");
        }
    }
}
