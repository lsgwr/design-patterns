/***********************************************************
 * @Description : 表格工厂类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 9:25
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第4节_简单工厂模式应用实例;

public class ChartFactory {
    /**
     * 静态工厂方法
     *
     * @param type 表格的类型
     * @return 指定表格类型的实例
     */
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼图");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}
