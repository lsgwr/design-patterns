/***********************************************************
 * @Description : 讲师关注课程，可以自动得到相关的问题推送
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 12:44
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第21章_观察者模式.订阅课程的例子;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() + "课程接收到一个" + question.getUserName() + "提交的问答：" + question.getQuestionContent());
    }
}
