package com.hs.GongChang;

/**
 * @author Huasheng
 * @Date 2021/05/09/19:48
 * @Description
 */
public class WindowsFactory extends Factory{
    @Override
    public Button createButton() {
        return new Egbutton();
    }
}
