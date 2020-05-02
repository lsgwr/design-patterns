package 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V1基本实现;

import org.junit.Test;

public class SingletonHungryTest {
    static class MyThread implements Runnable {
        @Override
        public void run() {
            SingletonHungry singletonHungry = SingletonHungry.getInstance();
            System.out.println(Thread.currentThread().getName() + "：" + singletonHungry);
        }
    }

    @Test
    public void getInstance() {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("获取单例模式失败！");
    }
    /**
     * 获取单例模式失败！
     * Thread-1：第4到27章_23大设计模式.第08章_单例模式.饿汉式.V1基本实现.SingletonHungry@34940b96
     * Thread-0：第4到27章_23大设计模式.第08章_单例模式.饿汉式.V1基本实现.SingletonHungry@34940b96
     */
}