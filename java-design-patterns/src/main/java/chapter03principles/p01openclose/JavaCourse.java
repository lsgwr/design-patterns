/***********************************************************
 * @Description : Java课程，实现Course接口
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 17:54
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p01openclose;

public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
