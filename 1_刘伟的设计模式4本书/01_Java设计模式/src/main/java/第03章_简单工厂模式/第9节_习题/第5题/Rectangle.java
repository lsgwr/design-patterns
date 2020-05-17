/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 10:57
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第9节_习题.第5题;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画出一个长方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个长方形");
    }
}
