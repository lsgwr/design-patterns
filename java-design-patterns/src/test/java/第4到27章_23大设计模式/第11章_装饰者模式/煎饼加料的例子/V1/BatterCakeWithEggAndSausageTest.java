package 第4到27章_23大设计模式.第11章_装饰者模式.煎饼加料的例子.V1;

import org.junit.Test;

public class BatterCakeWithEggAndSausageTest {
    /**
     * 煎饼的销售价格：8
     */
    @Test
    public void testBatterCake() {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + "的销售价格：" + batterCake.getCost());
    }

    /**
     * 煎饼 加一个鸡蛋的销售价格：9
     */
    @Test
    public void testBatterCakeWithEgg() {
        BatterCakeWithEgg batterCake = new BatterCakeWithEgg();
        System.out.println(batterCake.getDesc() + "的销售价格：" + batterCake.getCost());
    }

    /**
     * 煎饼 加一个鸡蛋 加一根香肠的销售价格：11
     */
    @Test
    public void testBatterCakeWithEggAndSausage() {
        BatterCakeWithEggAndSausage batterCake = new BatterCakeWithEggAndSausage();
        System.out.println(batterCake.getDesc() + "的销售价格：" + batterCake.getCost());
    }
}