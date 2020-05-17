/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 15:57
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第4题;

import org.junit.After;

public class Client {
    private CarFactory factory = null;
    private Car car = null;

    /**
     * 生产了一台奔驰车
     * 我是一台奔驰！
     */
    @org.junit.Test
    public void test1() {
        factory = new BenzFactory();
    }

    /**
     * 生产了一台宝马车
     * 我是一台宝马
     */
    @org.junit.Test
    public void test2() {
        factory = new BmwFactory();
    }

    /**
     * 每一个测试方法的调用顺序为: @Before -> @Test -> @After;
     */
    @After
    public void create() {
        car = factory.productCar();
        car.getName();
    }
}

