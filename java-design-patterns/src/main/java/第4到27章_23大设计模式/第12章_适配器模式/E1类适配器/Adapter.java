/***********************************************************
 * @Description : 适配器
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 9:57
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第12章_适配器模式.E1类适配器;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
