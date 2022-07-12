package com.xj.pattern.abstractFactoryPattern.button;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: WindowsButton
 * @Date: 2022/7/11
 * @Description: What is this?
 * 所有产品系列都有相同的品种（MacOS/Windows）
 * 这是按钮的 Windows 变体
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
