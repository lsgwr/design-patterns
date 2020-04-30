package 第4到27章_23大设计模式.第06章_抽象工厂模式;

import org.junit.Test;

public class CourseFactoryTest {

    /**
     * 录制Java课程视频！
     * 编写Java课程手记
     */
    @Test
    public void javaCourse() {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }

    /**
     * 录制Python课程视频！
     * 编写Python课程手记
     */
    @Test
    public void pythonCourse() {
        CourseFactory courseFactory = new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
