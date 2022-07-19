package com.xj.pattern.CreativePattern.builderPattern.builders;

import com.xj.pattern.CreativePattern.builderPattern.cars.Car;
import com.xj.pattern.CreativePattern.builderPattern.cars.CarType;
import com.xj.pattern.CreativePattern.builderPattern.components.Engine;
import com.xj.pattern.CreativePattern.builderPattern.components.GPSNavigator;
import com.xj.pattern.CreativePattern.builderPattern.components.Transmission;
import com.xj.pattern.CreativePattern.builderPattern.components.TripComputer;

/**
 * CarBuilder
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/12
 * <p>汽车生成器
 * 具体构建器执行公共接口中定义的步骤。
 */
public class CarBuilder implements  Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult(){
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
