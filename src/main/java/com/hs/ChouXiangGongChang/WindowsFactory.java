package com.hs.ChouXiangGongChang;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:09
 * @Description
 */
public class WindowsFactory implements Factory{

    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}
