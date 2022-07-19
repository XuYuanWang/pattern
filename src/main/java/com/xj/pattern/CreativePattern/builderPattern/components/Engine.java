package com.xj.pattern.CreativePattern.builderPattern.components;

/**
 * Engine
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/12
 * <p>产品特征1：引擎
 * 只是汽车的另一个特点。
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started = true;
    }

    public void off(){
        started = false;
    }

    public void go(double mileage){
        if(started){
            this.mileage += mileage;
        }else {
            System.err.println("Cannot go(),you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isStarted() {
        return started;
    }

}
