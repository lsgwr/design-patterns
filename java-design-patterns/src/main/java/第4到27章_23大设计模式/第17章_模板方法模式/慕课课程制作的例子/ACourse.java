/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 0:52
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第17章_模板方法模式.慕课课程制作的例子;

public abstract class ACourse {
    /**
     * 声明为final是不想让子类继承并修改此方法
     */
    protected final void makeCourse() {
        makePpt();
        makeVideo();
        if (needWriteArticle()) {
            writeArticle();
        }
        packageCourse();
    }

    final void makePpt() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    // 编写手记的钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    /**
     * 包装课程，不同的实现类是不同地，所以这里交给子类去实现
     */
    abstract void packageCourse();
}
