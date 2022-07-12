package com.xj.pattern.factoryPattern.factory;

import com.xj.pattern.factoryPattern.button.Button;
import com.xj.pattern.factoryPattern.button.HtmlButton;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: HtmlDialog
 * @Date: 2022/7/1
 * @Description: 具体创建者
 * HTML Dialog 将产生 HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
