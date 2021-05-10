package com.hs.YuanXing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Huasheng
 * @Date 2021/05/10/15:01
 * 克隆
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        List<Shapes> shapes = new ArrayList<>();
        List<Shapes> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle EgCircle = (Circle) circle.clone();
        shapes.add(EgCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.height = 20;
        rectangle.width = 10;
        rectangle.color = "blue";
        shapes.add(rectangle);
        cloneAndCompare(shapes,shapesCopy);
    }

    private static void cloneAndCompare(List<Shapes> shapes,List<Shapes> shapesCopy){
        for (Shapes shapes1 : shapes){
            shapesCopy.add(shapes1.clone());
        }

        for (int i = 0;i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + "形状不同的对象");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + "他们是一样的");
                } else {
                    System.out.println(i + "但他们不是一样的");
                }
            }else {
                System.out.println(i + "形状相同的对象");
            }
        }
    }
}
