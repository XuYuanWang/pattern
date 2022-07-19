package com.xj.pattern.StructuralPattern.adapterPattern.adapters;

import com.xj.pattern.StructuralPattern.adapterPattern.round.RoundPeg;
import com.xj.pattern.StructuralPattern.adapterPattern.square.SquarePeg;

/**
 * SquareAdapter
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/15
 * <p>方钉到圆钉的适配器
 * 适配器允许将方形钉安装到圆孔中。
 */
public class SquareAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquareAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // 计算一个最小圆半径，它可以适合这个挂钩。
        return  (Math.sqrt(Math.pow((peg.getWidth()/2),2)*2));
    }
}

