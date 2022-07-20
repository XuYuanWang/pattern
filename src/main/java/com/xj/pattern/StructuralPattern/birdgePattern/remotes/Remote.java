package com.xj.pattern.StructuralPattern.birdgePattern.remotes;

/**
 * Remote
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/20
 * <p>
 * 所有远程控制器的通用接口
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
