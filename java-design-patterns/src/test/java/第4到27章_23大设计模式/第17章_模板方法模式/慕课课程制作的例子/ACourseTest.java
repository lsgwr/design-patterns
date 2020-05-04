package 第4到27章_23大设计模式.第17章_模板方法模式.慕课课程制作的例子;

import org.junit.Test;

import static org.junit.Assert.*;

public class ACourseTest {

    @Test
    public void makeCourse() {
        System.out.println("后端设计模式start......");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式end......");

        System.out.println();

        System.out.println("前端课程start......");
        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
        System.out.println("前端课程end......");
    }
    /**
     * 后端设计模式start......
     * 制作PPT
     * 制作视频
     * 编写手记 // 这里是因为DesignPatternCourse重写了钩子函数needWriteArticle()
     * 提供课程Java源代码
     * 后端设计模式end......
     *
     * 前端课程start......
     * 制作PPT
     * 制作视频
     * 提供课程的前端代码
     * 提供课程的图片视频等多媒体素材
     * 前端课程end......
     */
}