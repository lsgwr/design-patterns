/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 15:57
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第4题;

public class Client {
    @org.junit.Test
    public void test1() {
        CarFactory factory = new BenzFactory();
        Car car = factory.productCar();
        car.getName();
    }

    @org.junit.Test
    public void test2() {
        CarFactory factory = new BmwFactory();
        Car car = factory.productCar();
        car.getName();
    }
}
/**
 * 生产了一台奔驰车
 * 我是一台奔驰！
 * 生产了一台宝马车
 * 我是一台宝马
 */
