/***********************************************************
 * @Description : 加鸡蛋的煎饼
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 0:07
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第11章_装饰者模式.煎饼加料的例子.V1;

public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int getCost() {
        return super.getCost() + 1;
    }
}
