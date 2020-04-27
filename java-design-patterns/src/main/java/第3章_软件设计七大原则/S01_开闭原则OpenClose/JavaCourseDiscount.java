/***********************************************************
 * @Description : 打折需求扩展
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 18:30
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S01_开闭原则OpenClose;

public class JavaCourseDiscount extends JavaCourse {
    public JavaCourseDiscount(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "id = " + super.getId() + ", name = " + super.getName() + ", original price = " + this.getOriginalPrice() + ", discount price = " + this.getPrice();
    }
}
