package com.xj.pattern.StructuralPattern.birdgePattern.devices;

/**
 * Device
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/19
 * <p>
 * 所有设备通用接口
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
