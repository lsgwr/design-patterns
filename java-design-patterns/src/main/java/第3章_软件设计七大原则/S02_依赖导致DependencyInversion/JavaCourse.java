/***********************************************************
 * @Description : Java课程
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 19:53
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S02_依赖导致DependencyInversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Gelly在学习Java课程");
    }
}
