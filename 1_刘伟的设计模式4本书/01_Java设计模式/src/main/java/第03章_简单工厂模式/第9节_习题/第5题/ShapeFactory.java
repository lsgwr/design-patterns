/***********************************************************
 * @Description : 形状工厂
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 10:58
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第9节_习题.第5题;

public class ShapeFactory {
    /**
     * 根据形状得到具体的实体类
     *
     * @param shape 形状
     * @return 指定形状的实体类
     */
    public static Shape getShape(String shape) {
        switch (shape) {
            case "圆形":
                return new Circle();
            case "长方形":
                return new Rectangle();
            case "三角形":
                return new Triangle();
            default:
                throw new UnsupportedOperationException("无法创建此形状！"+shape);
        }
    }
}
