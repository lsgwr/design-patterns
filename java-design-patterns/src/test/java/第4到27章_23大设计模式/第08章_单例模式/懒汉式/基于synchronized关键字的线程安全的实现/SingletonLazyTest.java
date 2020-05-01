package 第4到27章_23大设计模式.第08章_单例模式.懒汉式.基于synchronized关键字的线程安全的实现;

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
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("获取单例模式结束~");
    }
}