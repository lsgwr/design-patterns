/***********************************************************
 * @Description : 饿汉时的基本实现，在类加载地时候就完成单例的初始化了
 * 通过反射调用readResolve()方法，返回之前就创建好的对象，解决了序列化破坏单例的问题
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 15:23
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V2序列化破坏单例模式及解决方案.E2解决序列化破坏单例模式的问题.E1序列化破坏单例模式;

import java.io.Serializable;

public class SingletonHungry implements Serializable {
    /**
     * 类加载地时候就初始化，声明为final防止被二次赋值。static表明对所有实例有效，这也是单例模式的关键
     * <p>
     * 也可以用静态代码块也实现，都是在类加载地时候初始化，等效于下面的代码
     * <code>
     * private final static SingletonHungry singletonHungry;
     * static {
     * singletonHungry = new SingletonHungry();
     * }
     * </code>
     */
    private final static SingletonHungry singletonHungry = new SingletonHungry();


    /**
     * 构造器必须是私有地，防止外部创建类实例，这个务必记熟
     */
    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return singletonHungry;
    }

    /**
     * 最终返回的是同一个单例对象。但中间过程也创建了对象，通过反射调用readResolve()方法(ObjectInputStream里面的方法)，返回之前就创建好的对象
     */
    private Object readResolve() {
        return singletonHungry;
    }
}
