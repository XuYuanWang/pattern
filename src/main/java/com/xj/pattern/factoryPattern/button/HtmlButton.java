package com.xj.pattern.factoryPattern.button;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: HtmlButton
 * @Date: 2022/7/1
 * @Description: 具体产品
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
