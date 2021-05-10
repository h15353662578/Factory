package com.hs.ChouXiangGongChang;


/**
 * @author Huasheng
 * @Date 2021/05/10/9:12
 * 抽象工厂设计模式客户端
 * @Description
 */
public class Demo {

    private static Test configureApplication(){
        //拿到Test方法
        Test test;
        Factory factory;
        //判定当前系统os 如判定macos则使用macos的方法 反之使用Windows的方法
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            factory = new MacosFactory();
            test = new Test(factory);
        }else {
            factory = new WindowsFactory();
            test = new Test(factory);
        }
        return test;
    }

    public static void main(String[] args) {
        Test test = configureApplication();
        test.paint();
    }
}
