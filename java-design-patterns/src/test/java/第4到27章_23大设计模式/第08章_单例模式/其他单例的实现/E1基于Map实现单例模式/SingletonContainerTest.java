package 第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E1基于Map实现单例模式;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonContainerTest {
    public static class MyThread implements Runnable {

        @Override
        public void run() {
            SingletonContainer.putInstance("objectKey", new Object());
            Object instance = SingletonContainer.getInstance("objectKey");
            System.out.println(Thread.currentThread().getName() + "：" + instance);
        }
    }

    /**
     * 输出如下：通过多线程调试可以让两个线程返回不同的单例对象，说明基于Map的单例模式是不可靠地
     * <p>
     * Thread-0：java.lang.Object@61496783
     * Thread-1：java.lang.Object@3e6c60e6
     * 获取单例结束！
     */
    @Test
    public void getInstance() {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("获取单例结束！");
    }
}