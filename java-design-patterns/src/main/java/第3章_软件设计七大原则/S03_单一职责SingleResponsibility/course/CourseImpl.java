/***********************************************************
 * @Description : 实现ICourse里面的所有接口
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/17 23:09
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S03_单一职责SingleResponsibility.course;

public class CourseImpl implements ICourse {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
