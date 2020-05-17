/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 16:23
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第5题;

public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建了一个柱状图");
    }

    @Override
    public void getType() {
        System.out.println("我是柱状图");
    }
}
