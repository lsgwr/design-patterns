/***********************************************************
 * @Description : 前端课程
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 19:54
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p02dependenceinversion;

public class FeCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习前端课程");
    }
}
