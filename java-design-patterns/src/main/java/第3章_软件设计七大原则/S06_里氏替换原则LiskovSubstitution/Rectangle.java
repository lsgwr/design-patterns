/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/19 08:21
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S06_里氏替换原则LiskovSubstitution;

public class Rectangle {
    private Long length;
    private Long width;

    public Rectangle() {
    }

    public Rectangle(Long length, Long width) {
        this.length = length;
        this.width = width;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}
