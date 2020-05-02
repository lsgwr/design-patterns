/***********************************************************
 * @Description : 基于ThreadLocal实现单例模式
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 20:28
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E2ThreadLocal线程单例;

public class SingletonThreadLocal {
    private static final ThreadLocal<SingletonThreadLocal> singletonThreadLocal = new ThreadLocal<SingletonThreadLocal>() {
        @Override
        protected SingletonThreadLocal initialValue() {
            return new SingletonThreadLocal();
        }
    };

    private SingletonThreadLocal() {

    }

    public static SingletonThreadLocal getInstance() {
        return singletonThreadLocal.get();
    }
}
