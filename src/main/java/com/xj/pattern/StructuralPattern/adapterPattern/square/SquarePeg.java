package com.xj.pattern.StructuralPattern.adapterPattern.square;

/**
 * SquarePeg
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p> 方钉
 *     SquarePegs 与 RoundHoles 不兼容（它们是由以前的开发团队实现的）。
 *     但是我们必须将它们整合到我们的程序中。
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquarePeg() {
        double result;
        result = Math.pow(this.width,2);
        return result;
    }
}
