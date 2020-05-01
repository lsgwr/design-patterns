/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/1 16:22
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第07章_建造者模式;

public class CourseBuilderImpl extends CourseBuilder {
    private Course course = new Course();
    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePpt(String coursePpt) {
        course.setCoursePpt(coursePpt);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQa(String courseQa) {
        course.setCourseQa(courseQa);
    }

    @Override
    public Course build() {
        return course;
    }
}
