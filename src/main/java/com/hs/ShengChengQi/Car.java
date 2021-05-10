package com.hs.ShengChengQi;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:32
 * 汽车产品
 * @Description
 */
public class Car {

    private final CarType carType;

    private final int seats;

    private final Engine engine;

    private final Transmission transmission;

    private final TripComputer tripComputer;

    private final GpsNavigator gpsNavigator;

    private double fuel = 0;

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GpsNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GpsNavigator gpsNavigator){
        this.carType = carType;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null){
            this.tripComputer.setCar(this);
        }

    }
}
