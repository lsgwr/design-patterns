/***********************************************************
 * @Description : 懒汉式的单例模式
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/1 21:17
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.懒汉式.基于synchronized关键字的线程安全的实现;

public class SingletonLazy {
    /**
     * 静态static属性归所有实例共享，是实现单例模式的关键
     */
    private static SingletonLazy singletonLazy = null;

    /**
     * 构造器必须是私有地，防止外部创建类实例
     */
    private SingletonLazy() {

    }

    /**
     * 简单的判空，线程不安全的实现，单线程下没问题，多线程下有出现多个SingletonLazy实例的风险
     *
     * synchronized加在static方法上是加在类上，等效于synchronized(SingletonLazy.class)，即
     * synchronized (SingletonLazy.class) {
     *     if (singletonLazy == null) {
     *         singletonLazy = new SingletonLazy();
     *     }
     * }
     */
    public synchronized static SingletonLazy getSingletonLazy() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
