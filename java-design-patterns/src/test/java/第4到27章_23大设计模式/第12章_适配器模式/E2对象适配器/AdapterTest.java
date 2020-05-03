package 第4到27章_23大设计模式.第12章_适配器模式.E2对象适配器;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void request() {
        Target target = new TargetImpl();
        target.request();

        // 不改变原Target实现类的基础上扩展自己的实现类
        Target targetAdapter = new Adapter();
        targetAdapter.request();
    }
    /**
     * 输出如下：
     *
     * Target的实现
     * 被适配者的方法
     */
}