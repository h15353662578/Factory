package com.hs.ZuHe;

import java.awt.*;

/**
 * @author Huasheng
 * @Date 2021/05/10/14:42
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Square(10, 10,  Color.BLUE),

                new CompoundShape(
                        new Square(110, 110,  Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
