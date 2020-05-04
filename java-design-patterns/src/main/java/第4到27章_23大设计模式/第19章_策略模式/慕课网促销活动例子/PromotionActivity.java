/***********************************************************
 * @Description : 具体的促销活动
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 11:21
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第19章_策略模式.慕课网促销活动例子;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
