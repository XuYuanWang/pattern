package com.xj.pattern.CreativePattern.prototypePattern.cache;

import com.xj.pattern.CreativePattern.prototypePattern.shapes.Circle;
import com.xj.pattern.CreativePattern.prototypePattern.shapes.Rectangle;
import com.xj.pattern.CreativePattern.prototypePattern.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * BundledShapeCache
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p>what's do?
 */
public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle",circle);
        cache.put("Medium blue rectangle",rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key,shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
