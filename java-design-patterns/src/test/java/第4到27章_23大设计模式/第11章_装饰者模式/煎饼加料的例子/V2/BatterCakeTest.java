package 第4到27章_23大设计模式.第11章_装饰者模式.煎饼加料的例子.V2;

import org.junit.Test;

public class BatterCakeTest {
    @Test
    public void testBatterCake() {
        ABatterCake aBatterCake = new BatterCake();
        // 加两个鸡蛋，new两次即可，每次new后的结果传给下一次new
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        // 加3根香肠
        aBatterCake = new SausageDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        // 煎饼 加一个鸡蛋 加一个鸡蛋 加一根香肠 加一根香肠 加一根香肠 的销售价格为：16
        System.out.println(aBatterCake.getDesc() + " 的销售价格为：" + aBatterCake.getCost());
    }
}