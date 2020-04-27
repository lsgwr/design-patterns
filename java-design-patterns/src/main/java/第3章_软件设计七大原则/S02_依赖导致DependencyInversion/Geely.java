/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 19:49
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S02_依赖导致DependencyInversion;

public class Geely {
    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
}
