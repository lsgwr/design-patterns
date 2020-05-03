/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 9:56
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第12章_适配器模式.E2对象适配器;

public class TargetImpl implements Target {
    @Override
    public void request() {
        System.out.println("Target的实现");
    }
}
