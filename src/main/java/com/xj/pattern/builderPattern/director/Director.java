package com.xj.pattern.builderPattern.director;

import com.xj.pattern.builderPattern.builders.Builder;
import com.xj.pattern.builderPattern.cars.CarType;
import com.xj.pattern.builderPattern.components.Engine;
import com.xj.pattern.builderPattern.components.GPSNavigator;
import com.xj.pattern.builderPattern.components.Transmission;
import com.xj.pattern.builderPattern.components.TripComputer;

/**
 * Director
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/12
 * <p>主管控制生成器
 * Director 定义了构建步骤的顺序。它通过通用的 Builder 接口与 builder 对象一起工作。因此它可能不知道正在构建什么产品。
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
