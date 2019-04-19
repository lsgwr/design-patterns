/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/19 08:22
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p06liskovsubstitution;

public class Square {
    /**
     * 边长
     */
    private Long sideLength;

    public Square() {
    }

    public Square(Long sideLength) {
        this.sideLength = sideLength;
    }

    public Long getSideLength() {
        return sideLength;
    }

    public void setSideLength(Long sideLength) {
        this.sideLength = sideLength;
    }
}
