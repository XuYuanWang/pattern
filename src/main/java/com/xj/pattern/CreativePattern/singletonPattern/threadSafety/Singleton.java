package com.xj.pattern.CreativePattern.singletonPattern.threadSafety;

/**
 * Singleton
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p>what's do?
 */
public final class Singleton {
    //该字段必须声明为 volatile，以便双重检查锁能够正常工作。
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        /*
         * 此处采用的方法称为双重检查锁定 (DCL)。
         * 它的存在是为了防止可能尝试同时获取单例实例的多个线程之间的竞争条件，从而创建单独的实例。

         * 看起来在这里有 `result` 变量是完全没有意义的。
         * 然而，在 Java 中实现双重检查锁定时有一个非常重要的警告，通过引入这个局部变量来解决这个问题。
         */
        Singleton result = instance;
        if (result == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
