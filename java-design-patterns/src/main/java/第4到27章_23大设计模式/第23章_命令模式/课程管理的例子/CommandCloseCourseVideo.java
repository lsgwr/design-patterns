/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 14:24
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第23章_命令模式.课程管理的例子;

public class CommandCloseCourseVideo implements Command {
    private CourseVideo courseVideo;

    public CommandCloseCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
