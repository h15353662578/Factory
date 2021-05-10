package com.hs.ShengChengQi;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:56
 * @Description
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car){
        System.out.println("燃料等级:" + car.getFuel());
    }

    public void showStatus(){
        if (this.car.getEngine().isStarted()){
            System.out.println("汽车启动");
        }else {
            System.out.println("汽车未启动");
        }
    }
}
