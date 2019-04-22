/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/22 08:13
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package patterns.chapter04simplefactory;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
