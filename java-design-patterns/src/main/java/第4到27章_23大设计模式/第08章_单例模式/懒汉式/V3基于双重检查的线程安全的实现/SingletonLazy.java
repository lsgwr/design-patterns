/***********************************************************
 * @Description : 懒汉式的单例模式
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 10:57
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.懒汉式.V3基于双重检查的线程安全的实现;

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
     */
    public static SingletonLazy getSingletonLazy() {
        if (singletonLazy == null) {
            // 为空要锁定当前类，防止其他线程实例化
            synchronized (SingletonLazy.class) {
                // 进入后仍要二次判空确认下
                if (singletonLazy == null) {
                    // 下面的实例化分为三个步骤，因为指令重排序会导致2和3的执行顺序不同，为了避免这种情况，需要把singletonLazy声明为volatile类型
                    // 1.分配内存给singletonLazy
                    // 2.初始化对象
                    // 3.设置singletonLazy指定刚分配的内存地址
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
