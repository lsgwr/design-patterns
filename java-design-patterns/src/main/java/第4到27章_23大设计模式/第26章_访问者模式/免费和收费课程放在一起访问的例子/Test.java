package 第4到27章_23大设计模式.第26章_访问者模式.免费和收费课程放在一起访问的例子;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geely
 */
public class Test {
    /**
     * 免费课程:SpringMVC数据绑定
     * 实战课程:Java设计模式精讲 -- By Geely 价格:299元
     */
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲 -- By Geely");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for(Course course : courseList){
            course.accept(new Visitor());
        }
    }
}
