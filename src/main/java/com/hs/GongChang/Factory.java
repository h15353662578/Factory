package com.hs.GongChang;

/**
 * @author Huasheng
 * @Date 2021/05/09/19:34
 * @Description
 */
public abstract class Factory {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
