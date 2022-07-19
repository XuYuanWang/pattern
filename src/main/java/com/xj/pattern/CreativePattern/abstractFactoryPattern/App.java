package com.xj.pattern.CreativePattern.abstractFactoryPattern;

import com.xj.pattern.CreativePattern.abstractFactoryPattern.button.Button;
import com.xj.pattern.CreativePattern.abstractFactoryPattern.checkboxes.Checkbox;
import com.xj.pattern.CreativePattern.abstractFactoryPattern.factory.GUIFactory;

/**
 * Demo
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/11
 * <p>工厂用户并不关心他们使用哪个具体工厂，因为他们通过抽象接口与工厂和产品打交道。
 */
public class App {
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
