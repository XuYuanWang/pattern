package com.xj.pattern.CreativePattern.factoryPattern.factory;

import com.xj.pattern.CreativePattern.factoryPattern.button.Button;
import com.xj.pattern.CreativePattern.factoryPattern.button.WindowsButton;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: WindowsDialog
 * @Date: 2022/7/1
 * @Description: 另一个具体创建者
 * Windows Dialog 将产生 Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
