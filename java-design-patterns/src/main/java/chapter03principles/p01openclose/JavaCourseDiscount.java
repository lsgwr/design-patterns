/***********************************************************
 * @Description : 打折需求扩展
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 18:30
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p01openclose;

public class JavaCourseDiscount extends JavaCourse {
    public JavaCourseDiscount(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public String toString() {
        return "id = " + super.getId() + ", name = " + super.getName() + ", discount price = " + this.getPrice();
    }
}
