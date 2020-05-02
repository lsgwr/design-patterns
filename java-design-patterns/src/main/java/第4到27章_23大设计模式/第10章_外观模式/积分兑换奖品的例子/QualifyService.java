/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 22:12
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第10章_外观模式.积分兑换奖品的例子;

public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        // 实际业务中的校验逻辑会复杂地多
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过，库存通过");
        return true;
    }
}
