package chapter04simplefactory.test;

import chapter04simplefactory.Video;
import chapter04simplefactory.VideoFactory;
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
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();
    }
} 
