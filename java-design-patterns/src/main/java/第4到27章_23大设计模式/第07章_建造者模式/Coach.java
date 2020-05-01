/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/1 16:30
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第07章_建造者模式;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course build(String courseName, String coursePpt, String courseVideo,
                        String courseArticle, String courseQa) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePpt(coursePpt);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQa(courseQa);
        return courseBuilder.build();
    }
}
