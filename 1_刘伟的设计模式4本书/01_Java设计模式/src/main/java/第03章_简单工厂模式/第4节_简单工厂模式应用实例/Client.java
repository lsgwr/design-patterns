/***********************************************************
 * @Description : 图表测试
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 10:11
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第4节_简单工厂模式应用实例;

public class Client {
    public static void main(String[] args) {
        Chart chart;
        // 通过静态工厂方法创建产品
        chart = ChartFactory.getChart("histogram");
        chart.display();

        // 通过XML读取配置文件中的参数
        String type = XMLUtil.getChartType();
        // 创建产品对象
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
