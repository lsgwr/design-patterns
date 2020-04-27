/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/17 08:07
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S02_依赖导致DependencyInversion;

public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely正在学习Python课程");
    }
}
