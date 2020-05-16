/***********************************************************
 * @Description : 工厂类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/16 23:52
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第3节_简单工厂模式结构与实现;

public class Factory {
    /**
     * 静态工厂方法
     *
     * @param arg 具体类的名字
     * @return 具体类的实例对象
     */
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
