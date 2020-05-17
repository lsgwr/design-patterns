/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 15:52
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第4题;

public class BmwFactory implements CarFactory {
    public BmwFactory() {
        System.out.println("生产了一台宝马车");
    }

    @Override
    public Car productCar() {
        return new Bmw();
    }
}
