package com.xj.pattern.CreativePattern.abstractFactoryPattern.factory;

import com.xj.pattern.CreativePattern.abstractFactoryPattern.button.Button;
import com.xj.pattern.CreativePattern.abstractFactoryPattern.checkboxes.Checkbox;

/**
 * @author XuJun
 * @version 1.0
 * @className GUIFactory
 * @date 2022/7/11
 * @description 抽象工厂
 * 抽象工厂知道所有（抽象）产品类型。
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
