/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 11:02
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第9节_习题.第5题;

public class Test {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("圆形");
        shape.draw();
        shape.erase();

        shape = ShapeFactory.getShape("三角形");
        shape.draw();
        shape.erase();

        shape = ShapeFactory.getShape("长方形");
        shape.draw();
        shape.erase();

        shape = ShapeFactory.getShape("椭圆形");
        shape.draw();
        shape.erase();
    }
}
/**
 * 画出一个圆形
 * 擦除一个圆形
 * 画出一个三角形
 * 擦除一个三角形
 * 画出一个长方形
 * 擦除一个长方形
 * Exception in thread "main" java.lang.UnsupportedOperationException: 无法创建此形状！椭圆形
 * 	at 第03章_简单工厂模式.第9节_习题.第5题.ShapeFactory.getShape(ShapeFactory.java:25)
 * 	at 第03章_简单工厂模式.第9节_习题.第5题.Test.main(Test.java:23)
 */
