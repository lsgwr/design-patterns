/***********************************************************
 * @Description : 测试开闭原则的类
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 17:58
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S01_开闭原则OpenClose;

public class Test {
    public static void main(String[] args) {
        // 实现接口，面向接口编程，接口是不能变地
        ICourse iCourse1 = new JavaCourse(96, "Java编程思想", 348.00);
        System.out.println(iCourse1);
        // 利用类继承实现"课程打折"需求从而不改变ICourse和JavaCourse两个既有的类和接口
        ICourse iCourse2 = new JavaCourseDiscount(96, "Java编程思想", 348.00);
        System.out.println(iCourse2);
        // 如果想要调用JavaCourseDiscount中的getOriginalPrice()方法必须先把javaCourseDiscount强转换成JavaCourseDiscount类
        JavaCourseDiscount javaCourseDiscount = (JavaCourseDiscount) iCourse2;
        System.out.println((javaCourseDiscount).getOriginalPrice());
    }
}
