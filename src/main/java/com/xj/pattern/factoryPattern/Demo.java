package com.xj.pattern.factoryPattern;

import com.xj.pattern.factoryPattern.factory.Dialog;
import com.xj.pattern.factoryPattern.factory.HtmlDialog;
import com.xj.pattern.factoryPattern.factory.WindowsDialog;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: Demo
 * @Date: 2022/7/1
 * @Description: Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * 具体工厂的选择通常取决于配置或环境选项。
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     *
     * 所有客户端代码都应该通过抽象接口与工厂和产品一起工作。这样，它就不会关心它与哪个工厂合作以及它返回什么样的产品。
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }


}
