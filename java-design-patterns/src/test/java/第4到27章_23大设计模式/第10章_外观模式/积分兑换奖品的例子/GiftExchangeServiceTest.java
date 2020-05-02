package 第4到27章_23大设计模式.第10章_外观模式.积分兑换奖品的例子;

import org.junit.Test;

public class GiftExchangeServiceTest {

    @Test
    public void giftExchange() {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        // 进行业务处理，不需要关系具体的逻辑。类似于SpringBoot中的多Service聚合到一起来完成某些功能
        giftExchangeService.giftExchange(pointsGift);
    }
    /**
     * 输出如下：
     *
     * 校验T恤 积分资格通过，库存通过
     * 支付T恤 积分支付成功！
     * T恤进入物流系统
     * 物流系统下单成功，订单号是：666
     */
}