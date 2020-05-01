package 第4到27章_23大设计模式.第08章_单例模式.懒汉式.线程不安全的实现;

import org.junit.Test;

public class SingletonLazyTest {
    /**
     * 单线程下是没问题地
     */
    @Test
    public void 线程不安全的单例模式的测试1() {
        SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
        System.out.println("获取单例模式结束~");
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
            System.out.println(Thread.currentThread().getName() + "：" + singletonLazy);
        }
    }

    /**
     * 多线程下右可能会出现多个实例
     */
    @Test
    public void 线程不安全的单例模式的测试2() {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("获取单例模式结束~");
    }
}
