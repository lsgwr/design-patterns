package 第4到27章_23大设计模式.第07章_建造者模式;

import org.junit.Test;

public class CoachTest {

    /**
     * Course{courseName='Java设计模式精讲', coursePpt='Java设计模式PPT', courseVideo='Java设计模式教学视频', courseArticle='Java设计模式手记', courseQa='Java设计模式问答'}
     */
    @Test
    public void buildTest() {
        CourseBuilder courseBuilder = new CourseBuilderImpl();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.build("Java设计模式精讲", "Java设计模式PPT", "Java设计模式教学视频",
                "Java设计模式手记", "Java设计模式问答");
        System.out.println(course);
    }
}
