/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 21:48
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第05章_抽象工厂模式.第4节_游戏皮肤的例子;

public class SummerComboBox implements ComboBox{
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框");
    }
}
