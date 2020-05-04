/***********************************************************
 * @Description : 促销策略工厂
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 11:28
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第19章_策略模式.慕课网促销活动例子;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> promotionStrategyMap = new HashMap<>();
    static {
        promotionStrategyMap.put("立减", new LiJianPromotionStrategy());
        promotionStrategyMap.put("返现", new FanXianPromotionStrategy());
        promotionStrategyMap.put("满减", new ManJianPromotionStrategy());
    }

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getPromotionStrategy(String key) {
        return promotionStrategyMap.get(key);
    }
 }
