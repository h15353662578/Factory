package com.hs.ShengChengQi;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:58
 * @Description
 */
public class Director {

    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GpsNavigator());
    }

    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.0,0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(8);
        builder.setEngine(new Engine(3.5,0));
        builder.setTripComputer(new TripComputer());
        builder.setTransmission(Transmission.SINGLE_SPEED);
        builder.setGpsNavigator(new GpsNavigator());
    }
}
