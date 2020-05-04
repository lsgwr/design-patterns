/***********************************************************
 * @Description : 设计模式课程
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 0:57
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第17章_模板方法模式.慕课课程制作的例子;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
