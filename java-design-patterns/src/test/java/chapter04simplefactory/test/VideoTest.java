package chapter04simplefactory.test;

import chapter04simplefactory.JavaVideo;
import chapter04simplefactory.Video;
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
        Video video = new JavaVideo();
        video.produce();
    }
} 
