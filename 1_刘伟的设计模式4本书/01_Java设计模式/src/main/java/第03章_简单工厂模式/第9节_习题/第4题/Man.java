/***********************************************************
 * @Description : 男人的实现
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 10:43
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第9节_习题.第4题;

public class Man implements Person {

    public Man() {
        System.out.println("创建了一个男人");
    }

    @Override
    public void say() {
        System.out.println("我是男人");
    }
}
