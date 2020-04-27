/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/18 23:17
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S05_迪米特法则Demeter;

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
