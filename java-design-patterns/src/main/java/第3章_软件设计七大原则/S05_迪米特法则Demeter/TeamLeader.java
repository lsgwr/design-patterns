/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/18 23:14
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S05_迪米特法则Demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourse() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
