package com.xj.pattern.CreativePattern.singletonPattern.singleThread;

/**
 * Singleton
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p>单列
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        //以下代码模拟缓慢的初始化。
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
