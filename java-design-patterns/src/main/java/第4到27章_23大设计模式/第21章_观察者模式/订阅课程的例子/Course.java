/***********************************************************
 * @Description : 课程类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 12:42
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第21章_观察者模式.订阅课程的例子;

public class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
