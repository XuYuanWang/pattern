package com.xj.pattern.StructuralPattern.birdgePattern;

import com.xj.pattern.StructuralPattern.birdgePattern.devices.Device;
import com.xj.pattern.StructuralPattern.birdgePattern.devices.Radio;
import com.xj.pattern.StructuralPattern.birdgePattern.devices.TV;
import com.xj.pattern.StructuralPattern.birdgePattern.remotes.AdvancedRemote;
import com.xj.pattern.StructuralPattern.birdgePattern.remotes.BasicRemote;

/**
 * Demo
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/20
 * <p>what's do?
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
