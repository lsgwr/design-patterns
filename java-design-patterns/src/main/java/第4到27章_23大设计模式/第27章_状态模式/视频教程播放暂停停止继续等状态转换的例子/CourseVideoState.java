package 第4到27章_23大设计模式.第27章_状态模式.视频教程播放暂停停止继续等状态转换的例子;

/**
 * Created by geely
 */
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();

}
