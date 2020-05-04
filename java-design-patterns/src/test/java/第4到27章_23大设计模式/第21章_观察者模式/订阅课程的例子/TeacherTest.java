package 第4到27章_23大设计模式.第21章_观察者模式.订阅课程的例子;

import org.junit.Test;

public class TeacherTest {
    /**
     * 夏洛在Java设计模式精讲课程中提交了问题
     * 李老师老师的Java设计模式精讲课程接收到一个夏洛提交的问答：秋雅为啥不爱我？
     * 王老师老师的Java设计模式精讲课程接收到一个夏洛提交的问答：秋雅为啥不爱我？
     */
    @Test
    public void 观察者模式测试() {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher1 = new Teacher("王老师");
        Teacher teacher2 = new Teacher("李老师");

        // 添加观察者
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        // 业务逻辑
        Question question = new Question("夏洛", "秋雅为啥不爱我？");
        course.produceQuestion(course, question);
    }
}