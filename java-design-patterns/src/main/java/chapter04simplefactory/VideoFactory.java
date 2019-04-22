/***********************************************************
 * @Description : 视频生产的简单工厂
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/22 08:19
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter04simplefactory;

public class VideoFactory {
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
