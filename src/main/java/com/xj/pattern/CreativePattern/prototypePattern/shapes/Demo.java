package com.xj.pattern.CreativePattern.prototypePattern.shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p>
 *     让你能复制已有的对象，而又无需使用代码依赖它们所属的类。
 */
public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes,shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i+": Shapes are different objects(yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i+": And they are identical(yay!)");
                } else {
                    System.out.println(i+": But they are not identical(booo!)");
                }
            } else {
                System.out.println(i+": Shape objects are the same(booo!)");
            }
        }

    }

}
