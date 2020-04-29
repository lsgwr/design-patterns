package 第4到27章_23大设计模式.第05章_工厂模式;

import org.junit.Test;

public class VideoTest {
    @Test
    public  void testJavaVideo() {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

    @Test
    public  void testPythonVideo() {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

    @Test
    public  void testFEVideo() {
        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
/**
 * 录制Python课程视频
 * 录制Java课程视频
 * 录制前端视频！
 */
