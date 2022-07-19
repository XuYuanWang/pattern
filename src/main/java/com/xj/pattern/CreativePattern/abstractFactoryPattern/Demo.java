package com.xj.pattern.CreativePattern.abstractFactoryPattern;

import com.xj.pattern.CreativePattern.abstractFactoryPattern.factory.GUIFactory;
import com.xj.pattern.CreativePattern.abstractFactoryPattern.factory.MacOSFactory;
import com.xj.pattern.CreativePattern.abstractFactoryPattern.factory.WindowsFactory;

/**
 * Demo
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/11
 * <p>
 *    让你能创建一系列相关的对象，而无需指定其具体类
 */
public class Demo {
    /**
     * 应用程序根据配置或环境变量选择工厂类型并在运行时（通常在初始化阶段）创建它。
     */
    private static App configureApplication(){
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println("osName: " + osName);
        if (osName.equals("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new App(factory);
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}
