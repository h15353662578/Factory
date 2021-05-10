package com.hs.ShengChengQi;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:26
 * 通用汽车生成器接口
 * @Description
 */
public interface Builder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGpsNavigator(GpsNavigator gpsNavigator);
}
