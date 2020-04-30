/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/4/30 22:11
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第06章_抽象工厂模式;

public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python课程视频！");
    }
}
