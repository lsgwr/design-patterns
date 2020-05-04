package 第4到27章_23大设计模式.第21章_观察者模式.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * Created by geely
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        // 注册我们的监听器
        eventbus.register(guavaEvent);
        eventbus.post("post的内容");
    }
}
