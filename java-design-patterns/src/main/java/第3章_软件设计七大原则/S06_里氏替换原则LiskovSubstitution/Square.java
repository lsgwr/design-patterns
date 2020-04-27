/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/19 08:22
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S06_里氏替换原则LiskovSubstitution;

public class Square extends Rectangle{
    /**
     * 边长
     */
    private Long sideLength;

    public Square() {
    }

    @Override
    public Long getLength() {
        return getSideLength();
    }

    @Override
    public void setLength(Long length) {
        setSideLength(length);
    }

    @Override
    public Long getWidth() {
        return getSideLength();
    }

    @Override
    public void setWidth(Long width) {
        setSideLength(width);
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
