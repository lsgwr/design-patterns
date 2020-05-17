/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 16:27
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第5题;

import org.junit.After;
import org.junit.Test;

public class Client {

    private Chart chart = null;
    private ChartFactory factory;

    /**
     * 创建了一个曲线图
     * 我是曲线图
     */
    @Test
    public void testLine() {
        factory = new LineChartFactory();
    }

    /**
     * 创建了一个柱状图
     * 我是柱状图
     */
    @Test
    public void testHistogram() {
        factory = new HistogramChartFactory();
    }

    /**
     * 每一个测试方法的调用顺序为: @Before -> @Test -> @After;
     */
    @After
    public void create(){
        chart = factory.draw();
        chart.getType();
    }
}
