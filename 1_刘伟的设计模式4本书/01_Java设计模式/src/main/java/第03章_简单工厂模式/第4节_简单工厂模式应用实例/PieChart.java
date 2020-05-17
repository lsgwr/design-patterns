/***********************************************************
 * @Description : 饼图子类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 9:23
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第4节_简单工厂模式应用实例;

public class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼图");
    }

    @Override
    public void display() {
        System.out.println("显示饼图");
    }
}
