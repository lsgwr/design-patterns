/***********************************************************
 * @Description : 香肠的装饰类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 0:25
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第11章_装饰者模式.煎饼加料的例子.V2;

public class SausageDecorator extends ADecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }
}
