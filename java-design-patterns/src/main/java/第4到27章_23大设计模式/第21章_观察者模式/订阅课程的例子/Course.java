/***********************************************************
 * @Description : 课程类，继承Observable后作为被观察对象
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 12:42
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第21章_观察者模式.订阅课程的例子;

import java.util.Observable;

public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "课程中提交了问题");
        // 被观察者的状态变化了，是Observable里面的方法
        setChanged();
        // 通知观察者， 把对象传过去
        notifyObservers(question);
    }
}
