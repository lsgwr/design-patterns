package 第4到27章_23大设计模式.第19章_策略模式.慕课网促销活动例子;

import org.junit.Test;

import static org.junit.Assert.*;

public class PromotionActivityTest {

    /**
     * 立减促销，课程的价格直接减去配置的价格
     * 返现促销，返回的金额存放到慕课网用户的余额中
     */
    @Test
    public void executePromotionStrategy() {
        PromotionActivity promotionActivity618 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("立减"));
        PromotionActivity promotionActivity1111 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("返现"));
        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}