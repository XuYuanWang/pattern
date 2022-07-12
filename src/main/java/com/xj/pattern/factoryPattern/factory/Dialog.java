package com.xj.pattern.factoryPattern.factory;

import com.xj.pattern.factoryPattern.button.Button;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: Dialog
 * @Date: 2022/7/1
 * @Description: 基础创建者
 * 基础工厂类。请注意，“工厂”仅仅是类的一个角色。它应该有一些需要创建不同产品的核心业务逻辑。
 */
public abstract class Dialog {
    public void renderWindow() {
        // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 子类将覆盖此方法以创建特定的按钮对象。
     */
    public abstract Button createButton();
}
