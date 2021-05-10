package com.hs.YuanXing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Huasheng
 * @Date 2021/05/10/15:18
 * @Description
 */
public class BundledShapeCache {
    private Map<String,Shapes> cache = new HashMap<>();

    public BundledShapeCache(){
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("大绿圆",circle);
        cache.put("中蓝三角形",rectangle);
    }

    public Shapes put(String key,Shapes shapes){
        cache.put(key,shapes);
        return shapes;
    }

    public Shapes get(String key){
        return cache.get(key).clone();
    }
}
