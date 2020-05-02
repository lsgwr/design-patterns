package 第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E2ThreadLocal线程单例;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonThreadLocalTest {
    public static class MyThread implements Runnable {

        @Override
        public void run() {
            SingletonThreadLocal instance = SingletonThreadLocal.getInstance();
            System.out.println(Thread.currentThread().getName() + "：" + instance);
        }
    }

    /**
     * 从下面的结果可以看出每个线程拿到的单例是一个，不同的线程拿到的单例不是一个，这个是ThreadLocal的特性决定地
     * <p>
     * main：第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E2ThreadLocal线程单例.SingletonThreadLocal@722c41f4
     * main：第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E2ThreadLocal线程单例.SingletonThreadLocal@722c41f4
     * main：第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E2ThreadLocal线程单例.SingletonThreadLocal@722c41f4
     * main：第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E2ThreadLocal线程单例.SingletonThreadLocal@722c41f4
     * 获取单例结束！
     * Thread-0：第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E2ThreadLocal线程单例.SingletonThreadLocal@6e44c341
     * Thread-1：第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E2ThreadLocal线程单例.SingletonThreadLocal@3ea95853
     */
    @Test
    public void getInstance() {
        System.out.println(Thread.currentThread().getName() + "：" + SingletonThreadLocal.getInstance());
        System.out.println(Thread.currentThread().getName() + "：" + SingletonThreadLocal.getInstance());
        System.out.println(Thread.currentThread().getName() + "：" + SingletonThreadLocal.getInstance());
        System.out.println(Thread.currentThread().getName() + "：" + SingletonThreadLocal.getInstance());
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("获取单例结束！");
    }
}