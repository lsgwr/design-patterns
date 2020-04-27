package 第4到27章_23大设计模式.第4章_简单工厂模式.test;

import 第4到27章_23大设计模式.第4章_简单工厂模式.JavaVideo;
import 第4到27章_23大设计模式.第4章_简单工厂模式.Video;
import 第4到27章_23大设计模式.第4章_简单工厂模式.VideoFactory;
import org.junit.Test;

/**
 * Video Tester.
 *
 * @author liangshanguang
 * @date 04/22/2019
 * @description test
 */
public class VideoTest {

    @Test
    public void testMain() {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
} 
