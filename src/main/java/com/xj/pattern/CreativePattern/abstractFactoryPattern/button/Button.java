package com.xj.pattern.CreativePattern.abstractFactoryPattern.button;

/**
 * @Author: XuJun
 * @Version：1.0
 * @ClassName: Button
 * @Date: 2022/7/11
 * @Description: 第一个产品层次结构
 * 抽象工厂假设您有多个产品系列，它们被构造成单独的类层次结构（ButtonCheckbox）。
 * 同一家族的所有产品都具有通用接口。
 * 这是按钮系列的通用接口。
 */
public interface Button {
    void paint();
}
