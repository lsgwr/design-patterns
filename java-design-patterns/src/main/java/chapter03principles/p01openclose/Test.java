/***********************************************************
 * @Description : 测试开闭原则的类
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 17:58
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p01openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "Java编程思想", 348.00);

        System.out.println(javaCourse);
    }
}
