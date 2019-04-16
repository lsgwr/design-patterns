/***********************************************************
 * @Description : Java课程
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 19:53
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p02dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Gelly在学习Java课程");
    }
}
