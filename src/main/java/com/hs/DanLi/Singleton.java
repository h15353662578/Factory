package com.hs.DanLi;

/**
 * @author Huasheng
 * @Date 2021/05/10/10:35
 * 将默认构造函数设为私有， 防止其他对象使用单例类的 new运算符。
 * 新建一个静态构建方法作为构造函数  该函数会偷偷调用私有构造函数来创建对象 并将其保存在一个静态成员变量中
 * 此后所有对于该函数的调用都将返回这一缓存对象
 * @Description
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
