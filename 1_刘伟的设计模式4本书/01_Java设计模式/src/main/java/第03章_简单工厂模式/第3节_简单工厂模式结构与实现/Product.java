/***********************************************************
 * @Description : 具体类的共同的父类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/16 23:45
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第3节_简单工厂模式结构与实现;

public abstract class Product {
    /**
     * 所有产品类的公共业务方法
     */
    public void methodSame() {
        System.out.println("公共方法的实现");
    }

    /**
     * 声明抽象业务方法
     */
    public abstract void methodDiff();
}
