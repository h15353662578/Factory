package com.hs.ShengChengQi;

/**
 * @author Huasheng
 * @Date 2021/05/10/10:09
 * 客户端
 * @Description
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("汽车构建:\n" + car.getCarType());

        CarMenualBuilder carMenualBuilder = new CarMenualBuilder();

        director.constructSportsCar(carMenualBuilder);
        Manual manual = carMenualBuilder.getResult();
        System.out.println("\n汽车使用手册构建"+manual.print());
    }
}
