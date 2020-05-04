/***********************************************************
 * @Description : 返现促销
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 11:18
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第19章_策略模式.慕课网促销活动例子;

public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
