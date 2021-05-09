package com.hs.GongChang;

/**
 * @author Huasheng
 * @Date 2021/05/09/19:37
 * @Description
 */
public class Test {

    private static Factory factory;

    public static void main(String[] args){
        configure();
        runBusinessLongic();
    }

    static void configure(){
        if (System.getProperty("os.name").equals("Windows 10")){
            factory = new WindowsFactory();
        }else{
            factory = new HtmlFactory();
        }
    }
    static void runBusinessLongic(){
        factory.renderWindow();
    }
}
