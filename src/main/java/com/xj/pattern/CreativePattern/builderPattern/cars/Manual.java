package com.xj.pattern.CreativePattern.builderPattern.cars;

import com.xj.pattern.CreativePattern.builderPattern.components.Engine;
import com.xj.pattern.CreativePattern.builderPattern.components.GPSNavigator;
import com.xj.pattern.CreativePattern.builderPattern.components.Transmission;
import com.xj.pattern.CreativePattern.builderPattern.components.TripComputer;

/**
 * Manual
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/12
 * <p>这是一个产品手册类
 * 汽车手册是另一种产品。请注意，它与 Car 的祖先不同。它们不相关。
 */
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
