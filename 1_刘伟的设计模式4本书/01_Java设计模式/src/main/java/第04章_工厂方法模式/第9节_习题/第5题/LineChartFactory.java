/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 16:25
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第5题;

public class LineChartFactory implements ChartFactory {
    @Override
    public Chart draw() {
        return new LineChart();
    }
}
