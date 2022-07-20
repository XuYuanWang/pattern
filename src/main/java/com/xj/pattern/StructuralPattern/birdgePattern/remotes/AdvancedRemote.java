package com.xj.pattern.StructuralPattern.birdgePattern.remotes;

import com.xj.pattern.StructuralPattern.birdgePattern.devices.Device;

/**
 * AdvancedRemote
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/20
 * <p>
 *  高级远程控制器
 */
public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    /**
     * 设置静音🔕
     */
    public void mute() {
        System.out.println("Remote:mute");
        device.setVolume(0);
    }
}
