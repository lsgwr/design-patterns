/***********************************************************
 * @Description : 需要应用层知道的礼物兑换服务
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 22:19
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第10章_外观模式.积分兑换奖品的例子;

/**
 * 只对外开发必要的服务，这也是外观模式的核心
 */
public class GiftExchangeService {
    /**
     * 资格校验服务
     */
    private QualifyService qualifyService;
    /**
     * 积分兑换服务
     */
    private PointsPaymentService pointsPaymentService;
    /**
     * 物流服务
     */
    private ShippingService shippingService;

    public GiftExchangeService() {
        this.qualifyService = new QualifyService();
        this.pointsPaymentService = new PointsPaymentService();
        this.shippingService = new ShippingService();
    }

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            // 资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                // 如果积分支付成功，返回物流单号
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是：" + shippingOrderNo);
            }
        }
    }
}
