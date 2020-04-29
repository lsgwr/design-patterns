package 第4到27章_23大设计模式.第5章_工厂模式;

public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
