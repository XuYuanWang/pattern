package com.xj.pattern.builderPattern;

import com.xj.pattern.builderPattern.builders.CarBuilder;
import com.xj.pattern.builderPattern.builders.CarManualBuilder;
import com.xj.pattern.builderPattern.cars.Car;
import com.xj.pattern.builderPattern.cars.Manual;
import com.xj.pattern.builderPattern.director.Director;

/**
 * Demo
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/12
 * <p>what's do?
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // 主管可能知道几种创建配方。
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
