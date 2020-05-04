/***********************************************************
 * @Description : 前端课程
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 10:16
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第17章_模板方法模式.慕课课程制作的例子;

public class FECourse extends ACourse {
    /**
     * 是否需要写手记
     */
    private boolean writeArticle = false;

    public FECourse(boolean writeArticle) {
        this.writeArticle = writeArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片视频等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return writeArticle;
    }
}
