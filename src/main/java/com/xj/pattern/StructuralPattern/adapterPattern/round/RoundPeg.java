package com.xj.pattern.StructuralPattern.adapterPattern.round;

/**
 * RoundPeg
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p>
 *     圆钉 圆钉与圆孔兼容。
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {

    }

    public RoundPeg(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
