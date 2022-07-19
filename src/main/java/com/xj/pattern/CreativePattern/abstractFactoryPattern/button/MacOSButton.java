package com.xj.pattern.CreativePattern.abstractFactoryPattern.button;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: MacOSButton
 * @Date: 2022/7/11
 * @Description: What is this?
 * 所有产品系列都有相同的品种（MacOS/Windows）
 * 这是按钮的 MacOS 变体
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
