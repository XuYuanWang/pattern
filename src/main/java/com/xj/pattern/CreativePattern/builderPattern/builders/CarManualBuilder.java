package com.xj.pattern.CreativePattern.builderPattern.builders;

import com.xj.pattern.CreativePattern.builderPattern.cars.CarType;
import com.xj.pattern.CreativePattern.builderPattern.cars.Manual;
import com.xj.pattern.CreativePattern.builderPattern.components.Engine;
import com.xj.pattern.CreativePattern.builderPattern.components.GPSNavigator;
import com.xj.pattern.CreativePattern.builderPattern.components.Transmission;
import com.xj.pattern.CreativePattern.builderPattern.components.TripComputer;

/**
 * CarManualBuilder
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/12
 * <p>汽车手册生成器
 * 与其他创建模式不同，Builder 可以构建不相关的产品，这些产品没有通用接口。
 * 在这种情况下，我们使用与制造汽车相同的步骤为汽车构建用户手册。这允许为特定车型制作手册，配置不同的功能。
 */
public class CarManualBuilder implements Builder{
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
