package 第4到27章_23大设计模式.第05章_工厂模式;

public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
