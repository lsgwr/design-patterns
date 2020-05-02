/***********************************************************
 * @Description : 基于静态内部类的懒汉式单例模式
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 12:46
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.懒汉式.V3基于双重检查的线程安全的实现.E2让其他线程看不到指令重排序之静态内部类;

public class SingletonLazy {
    /**
     * private的静态内部类可以保证其他类看不到InnerClass中的单例实例化过程，即使里面发生指令重排序外面也是不可见地
     * <p>
     * 原理是静态内部类存在"类初始化锁"，等效于synchronized,同一时间只能有一个线程拿到锁
     * <p>
     * 类初始化的几种情况(都会产生类初始锁)：
     * 1、类实例被创建
     * 2、类中声明的静态方法被调用
     * 3、类中声明的静态成员被赋值
     * 4、类中声明的静态成员被使用且静态成员不是常量（即不被final修饰）
     * 5、类是顶级类，类中有断言语句
     * 前4种经常见，第5种较为少见
     */
    private static class InnerClass {
        private static SingletonLazy singletonLazy = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {
        return InnerClass.singletonLazy;
    }

    /**
     * 构造器必须是私有地，防止外部创建类实例
     */
    private SingletonLazy() {

    }
}
