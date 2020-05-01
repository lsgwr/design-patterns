package 第4到27章_23大设计模式.第07章_建造者模式.V2链式调用;


import org.junit.Test;

public class CourseTest {
    @Test
    public void courseTest() {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲").buildCoursePpt("Java设计模式PPT")
                .buildCourseVideo("Java设计模式视频").build();
        System.out.println(course);
    }
    /**
     * Course{courseName='Java设计模式精讲', coursePpt='Java设计模式PPT', courseVideo='null', courseArticle='null', courseQa='null'}
     */
}

