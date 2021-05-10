package com.hs.ChouXiangGongChang;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:08
 * @Description
 */
public class MacosFactory implements Factory{

    @Override
    public Button createButton() {
        return new MacosButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacosCheckBox();
    }
}
