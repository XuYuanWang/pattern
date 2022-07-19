package com.xj.pattern.CreativePattern.singletonPattern.singleThread;

import com.xj.pattern.CreativePattern.singletonPattern.multiThread.Singleton;

/**
 * Demo
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p>
 *     让你能够保证一个类只有一个实列，并提供一个访问该实例的全局节点。
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
