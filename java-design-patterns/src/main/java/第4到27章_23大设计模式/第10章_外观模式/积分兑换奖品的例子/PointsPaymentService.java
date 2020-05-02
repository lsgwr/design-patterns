/***********************************************************
 * @Description : 积分支付服务
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 22:14
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第10章_外观模式.积分兑换奖品的例子;

public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分支付成功！");
        return true;
    }
}
