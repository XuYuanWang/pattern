package com.xj.pattern.CreativePattern.prototypePattern.shapes;

import java.util.Objects;

/**
 * Shape
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p>通用形状接口
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) return false;
        Shape shape2 = (Shape) obj;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
