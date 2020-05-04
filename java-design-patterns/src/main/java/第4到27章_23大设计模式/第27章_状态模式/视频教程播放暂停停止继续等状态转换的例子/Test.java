package 第4到27章_23大设计模式.第27章_状态模式.视频教程播放暂停停止继续等状态转换的例子;

/**
 * Created by geely
 */
public class Test {
    /**
     * 当前状态:PlayState
     * 当前状态:PauseState
     * 当前状态:SpeedState
     * 当前状态:StopState
     * ERROR 停止状态不能快进!!
     */
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
    }
}
