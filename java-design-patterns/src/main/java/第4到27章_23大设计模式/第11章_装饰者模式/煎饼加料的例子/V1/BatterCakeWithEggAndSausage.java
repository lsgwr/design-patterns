/***********************************************************
 * @Description : 加鸡蛋和香肠的煎饼
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 0:09
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第11章_装饰者模式.煎饼加料的例子.V1;

public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}
