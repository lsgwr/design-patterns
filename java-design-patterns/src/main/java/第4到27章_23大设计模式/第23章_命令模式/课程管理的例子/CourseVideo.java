/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 14:22
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第23章_命令模式.课程管理的例子;

public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + "课程视频开放");
    }

    public void close() {
        System.out.println(name + "课程视频关闭");
    }
}
