package com.xj.pattern.abstractFactoryPattern.factory;

import com.xj.pattern.abstractFactoryPattern.button.Button;
import com.xj.pattern.abstractFactoryPattern.button.MacOSButton;
import com.xj.pattern.abstractFactoryPattern.checkboxes.Checkbox;
import com.xj.pattern.abstractFactoryPattern.checkboxes.MacOSCheckbox;

/**
 * MacOSFactory
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/11
 * <p>每个具体工厂都是基础工厂的延伸，负责创造单一品种的产品。
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
