package com.hs.ShengChengQi;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:38
 * 汽车手册产品
 * @Description
 */
public class Manual {

    private final CarType carType;

    private final int seats;

    private final Engine engine;

    private final Transmission transmission;

    private final TripComputer tripComputer;

    private final GpsNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GpsNavigator gpsNavigator){
        this.carType = carType;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;

    }
    public String print(){
        String info = "";
        info += "汽车类别"+ carType +"\n";
        info += "座位数量"+seats +"\n";
        info += "发动机体积"+engine.getVolume() + "; 里程 - " +engine.getMileage() + "\n";
        info += "传输:"+transmission + "\n";
        if (this.tripComputer != null){
            info += "运行设备 : 正常" + "\n";
        }else {
            info += "运行设备 : 未知" + "\n";
        }
        if (this.gpsNavigator != null){
            info += "Gps : 功能" + "\n";
        }else {
            info += "Gps : 未知";
        }
        return info;
    }


}
