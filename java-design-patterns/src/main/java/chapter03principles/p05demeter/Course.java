/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/18 23:17
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p05demeter;

public class Course {
    public String name;
    public long price;

    public Course() {
    }

    public Course(String name, long price) {
        this.name = name;
        this.price = price;
    }
}
