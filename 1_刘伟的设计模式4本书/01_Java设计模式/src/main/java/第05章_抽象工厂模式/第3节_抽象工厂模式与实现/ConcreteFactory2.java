/***********************************************************
 * @Description : 产品族2的工厂类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 21:38
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第05章_抽象工厂模式.第3节_抽象工厂模式与实现;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
