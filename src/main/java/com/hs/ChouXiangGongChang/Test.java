package com.hs.ChouXiangGongChang;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:11
 * 抽象工厂设计模式实现
 * @Description
 */
public class Test {

    //定义接口
    private Button button;
    private CheckBox checkBox;

    //Test方法创建新Button与checkBox
    public Test(Factory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    //调用paint方法
    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
