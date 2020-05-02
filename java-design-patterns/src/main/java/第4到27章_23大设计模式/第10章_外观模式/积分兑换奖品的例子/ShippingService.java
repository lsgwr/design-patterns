/***********************************************************
 * @Description : 物流服务
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 22:16
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第10章_外观模式.积分兑换奖品的例子;

public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
