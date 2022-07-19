package com.xj.pattern.CreativePattern.abstractFactoryPattern.checkboxes;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: WindowsCheckbox
 * @Date: 2022/7/11
 * @Description: What is this?
 * 所有产品系列都有相同的品种（MacOS/Windows）。
 * 这是复选框的变体。
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }
}
