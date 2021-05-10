package com.hs.GongChang;

/**
 * @author Huasheng
 * @Date 2021/05/09/19:47
 * @Description
 */
public class HtmlFactory extends Factory{

    @Override
    public Button createButton() {
        return new ButtonImpl();
    }
}
