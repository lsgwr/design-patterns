/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 0:22
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第11章_装饰者模式.煎饼加料的例子.V2;

/**
 * 抽象的装饰器类，可以定义抽象方法让子类必须实现，本例中没涉及，但是自己要知道
 */
public abstract class ADecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public ADecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int getCost() {
        return this.aBatterCake.getCost();
    }
}
