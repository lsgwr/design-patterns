/***********************************************************
 * @Description : 课程建造者
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/1 16:17
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第07章_建造者模式.V1基础实现;

public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePpt(String coursePpt);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQa(String courseQa);

    public abstract Course build();
}
