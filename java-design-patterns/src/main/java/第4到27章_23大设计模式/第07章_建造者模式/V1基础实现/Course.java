/***********************************************************
 * @Description : 课程视频
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/1 16:15
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第07章_建造者模式.V1基础实现;

public class Course {
    /**
     * 课程名
     */
    private String courseName;
    /**
     * PPT
     */
    private String coursePpt;
    /**
     * 课程视频
     */
    private String courseVideo;
    /**
     * 手记
     */
    private String courseArticle;
    /**
     * 问答
     */
    private String courseQa;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePpt() {
        return coursePpt;
    }

    public void setCoursePpt(String coursePpt) {
        this.coursePpt = coursePpt;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQa() {
        return courseQa;
    }

    public void setCourseQa(String courseQa) {
        this.courseQa = courseQa;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePpt='" + coursePpt + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQa='" + courseQa + '\'' +
                '}';
    }
}
