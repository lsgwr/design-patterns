/***********************************************************
 * @Description : Adapter不再继承Adaptee而是直接组合进来
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 10:06
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第12章_适配器模式.E2对象适配器;

public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
