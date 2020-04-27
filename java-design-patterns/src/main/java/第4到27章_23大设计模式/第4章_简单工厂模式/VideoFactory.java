/***********************************************************
 * @Description : 视频生产的简单工厂
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/22 08:19
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第4章_简单工厂模式;

public class VideoFactory {
    public Video getVideo(Class c) {
        Video video = null;
        // 反射获取对象
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
