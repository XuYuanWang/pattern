package com.xj.pattern.CreativePattern.builderPattern.builders;

import com.xj.pattern.CreativePattern.builderPattern.cars.CarType;
import com.xj.pattern.CreativePattern.builderPattern.components.Engine;
import com.xj.pattern.CreativePattern.builderPattern.components.GPSNavigator;
import com.xj.pattern.CreativePattern.builderPattern.components.Transmission;
import com.xj.pattern.CreativePattern.builderPattern.components.TripComputer;

/**
 * Builder
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/12
 * <p>Builder界面定义了配置产品的所有可能方式。
 */
public interface Builder {
    /**
     * 汽车类型
     * @param type
     */
    void setCarType(CarType type);

    /**
     * 座位数
     * @param seats
     */
    void setSeats(int seats);

    /**
     * 引擎
     * @param engine
     */
    void setEngine(Engine engine);

    /**
     * 变速器
     * @param transmission
     */
    void setTransmission(Transmission transmission);

    /**
     * 车行电脑
     * @param tripComputer
     */
    void setTripComputer(TripComputer tripComputer);

    /**
     * GPS
     * @param gpsNavigator
     */
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
