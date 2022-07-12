package com.xj.pattern.factoryPattern.button;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: Button
 * @Date: 2022/7/1
 * @Description: 通用产品接口
 * 生成跨平台的GUI元素
 */
public interface Button {
    void render();

    void onClick();
}
