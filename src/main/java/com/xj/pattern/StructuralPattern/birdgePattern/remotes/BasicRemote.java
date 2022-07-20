package com.xj.pattern.StructuralPattern.birdgePattern.remotes;

import com.xj.pattern.StructuralPattern.birdgePattern.devices.Device;

/**
 * BasicRemote
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/20
 * <p>
 *   基础远程控制器
 */
public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote:power toggle");
        if (device.isEnabled()) {
            device.enable();
        } else {
            device.disable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote:volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote:volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote:channel down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote:channel down");
        device.setChannel(device.getChannel() + 1);
    }
}
