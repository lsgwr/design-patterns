/***********************************************************
 * @Description : 具体类B
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/16 23:51
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第3节_简单工厂模式结构与实现;

public class ConcreteProductB extends Product {

    @Override
    public void methodDiff() {
        System.out.println("具体实现类B");
    }
}
