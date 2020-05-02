/***********************************************************
 * @Description : 鸡蛋的装饰类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 0:24
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第11章_装饰者模式.煎饼加料的例子.V2;

public class EggDecorator extends ADecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 1;
    }
}
