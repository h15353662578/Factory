package com.hs.DanLi;

/**
 * @author Huasheng
 * @Date 2021/05/10/10:37
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("如果看到相同的值说明Singleton被重用了\n如果看到不同的值说明Singleton被创建了两次");
        Singleton singleton = Singleton.getInstance("Test");
        Singleton EgSingleton = Singleton.getInstance("EgSingleton");
        System.out.println(singleton.value);
        System.out.println(EgSingleton.value);
        if (singleton == EgSingleton){
            System.out.println("单例设计true");
        }else {
            System.out.println("单例设计false");
        }
    }
}
