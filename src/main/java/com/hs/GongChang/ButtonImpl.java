package com.hs.GongChang;

/**
 * @author Huasheng
 * @Date 2021/05/09/19:26
 * 具体产品
 * @Description
 */
public class ButtonImpl implements Button{

    public void render(){
        System.out.println("<button>Test Button</button>");
    }

    public void onClick(){
        System.out.println("Click Button ------Huasheng");
    }
}
