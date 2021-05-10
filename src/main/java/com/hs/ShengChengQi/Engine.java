package com.hs.ShengChengQi;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:49
 * @Description
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume,double mileage){
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started = true;
    }

    public void off(){
        started = false;
    }

    public boolean isStarted(){
        return started;
    }

    public void go(double mileage){
        if (started){
            this.mileage += mileage;
        }else {
            System.out.println("未发动 你必须启动发动机");
        }
    }

    public double getVolume(){
        return volume;
    }

    public double getMileage(){
        return mileage;
    }
}
