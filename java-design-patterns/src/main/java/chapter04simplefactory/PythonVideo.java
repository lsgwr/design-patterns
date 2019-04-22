/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/22 08:14
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter04simplefactory;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
