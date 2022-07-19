package com.xj.pattern.StructuralPattern.adapterPattern;

import com.xj.pattern.StructuralPattern.adapterPattern.adapters.SquareAdapter;
import com.xj.pattern.StructuralPattern.adapterPattern.round.RoundHole;
import com.xj.pattern.StructuralPattern.adapterPattern.round.RoundPeg;
import com.xj.pattern.StructuralPattern.adapterPattern.square.SquarePeg;

/**
 * Demo
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/18
 * <p>what's do?
 */
public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if(hole.fits(rpeg)){
            System.out.println("圆钉 r5 适合圆孔 r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //hole.fits(smallSqPeg); //不会编译。

        // 适配器解决问题
        SquareAdapter smallSquareAdapter = new SquareAdapter(smallSqPeg);
        SquareAdapter largeSquareAdapter = new SquareAdapter(largeSqPeg);

        if (hole.fits(smallSquareAdapter)) {
            System.out.println("方钉 w2 适合圆孔 r5。");
        }
        if (!hole.fits(largeSquareAdapter)) {
            System.out.println("方钉 w20 不适合圆孔 r5。");
        }

    }
}
