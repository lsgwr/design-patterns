/***********************************************************
 * @Description : 煎饼类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 0:05
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第11章_装饰者模式.煎饼加料的例子.V1;

/**
 * 煎饼类，一些基础信息
 */
public class BatterCake {
    /**
     * 名称
     */
    public String getDesc() {
        return "煎饼";
    }

    /**
     * 费用
     */
    public int getCost() {
        return 8;
    }
}

