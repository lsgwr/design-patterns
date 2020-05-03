/***********************************************************
 * @Description : 课程类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/3 12:24
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第14章_组合模式.课程管理例子;

public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + ", Price:" + price);
    }
}
