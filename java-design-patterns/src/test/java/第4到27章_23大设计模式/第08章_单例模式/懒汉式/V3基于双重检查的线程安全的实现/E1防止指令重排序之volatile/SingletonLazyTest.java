package 第4到27章_23大设计模式.第08章_单例模式.懒汉式.V3基于双重检查的线程安全的实现.E1防止指令重排序之volatile;

import org.junit.Test;

public class SingletonLazyTest {

    static class MyThread implements Runnable {
        @Override
        public void run() {
            SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
            System.out.println(Thread.currentThread().getName() + "：" + singletonLazy);
        }
    }
    @Test
    public void getSingletonLazyTest() {
        Thread t1 = new Thread(new SingletonLazyTest.MyThread());
        Thread t2 = new Thread(new SingletonLazyTest.MyThread());
        t1.start();
        t2.start();
        System.out.println("获取单例模式结束~");
    }
    /**
     * 获取单例模式结束~
     * Thread-0：第4到27章_23大设计模式.第08章_单例模式.懒汉式.V3基于双重检查的线程安全的实现.SingletonLazy@34940b96
     * Thread-1：第4到27章_23大设计模式.第08章_单例模式.懒汉式.V3基于双重检查的线程安全的实现.SingletonLazy@34940b96
     */
}