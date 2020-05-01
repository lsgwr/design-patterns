/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/1 20:18
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第07章_建造者模式.V2链式调用;

public class Course {

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePpt = courseBuilder.coursePpt;
        this.courseVideo = courseBuilder.courseArticle;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQa = courseBuilder.courseQa;
    }

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

    /**
     * 静态内部类，把实体类和实体类的Builder放在一起
     */
    public static class CourseBuilder {
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

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            // 返回当前对象本身，方便调用
            return this;
        }

        public CourseBuilder buildCoursePpt(String coursePpt) {
            this.coursePpt = coursePpt;
            // 返回当前对象本身，方便调用
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            // 返回当前对象本身，方便调用
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            // 返回当前对象本身，方便调用
            return this;
        }

        public CourseBuilder buildCourseQa(String courseQa) {
            this.courseQa = courseQa;
            // 返回当前对象本身，方便调用
            return this;
        }

        public Course build() {
            // 调用Course的构造器
            return new Course(this);
        }
    }
}
