package 第4到27章_23大设计模式.第23章_命令模式.课程管理的例子;

import org.junit.Test;

public class CommandTest {

    /**
     * Java设计模式精讲课程视频开放
     * Java设计模式精讲课程视频关闭
     */
    @Test
    public void execute() {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲");
        CommandOpenCourseVideo commandOpenCourseVideo = new CommandOpenCourseVideo(courseVideo);
        CommandCloseCourseVideo commandCloseCourseVideo = new CommandCloseCourseVideo(courseVideo);
        Staff staff = new Staff();
        staff.addCommand(commandOpenCourseVideo);
        staff.addCommand(commandCloseCourseVideo);
        staff.executes();
    }
}