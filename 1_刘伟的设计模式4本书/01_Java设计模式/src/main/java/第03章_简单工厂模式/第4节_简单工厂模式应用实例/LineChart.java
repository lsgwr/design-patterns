/***********************************************************
 * @Description : 折线图子类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 9:23
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第4节_简单工厂模式应用实例;

public class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
