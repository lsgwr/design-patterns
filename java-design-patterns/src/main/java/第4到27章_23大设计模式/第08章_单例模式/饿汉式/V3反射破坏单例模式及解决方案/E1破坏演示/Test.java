/***********************************************************
 * @Description : 反射可以访问到私有构造器从而能拿到多个SingletonHungry地实例，因此破坏了单例模式
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 16:26
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V3反射破坏单例模式及解决方案.E1破坏演示;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objClass = SingletonHungry.class;
        Class.forName(SingletonHungry.class.getName());
        Constructor constructor = objClass.getDeclaredConstructor();
        // 这一句可以允许我们拿到私有构造器
        constructor.setAccessible(true);
        SingletonHungry instance = SingletonHungry.getInstance();
        SingletonHungry instanceNew = (SingletonHungry) constructor.newInstance();
        System.out.println(instance);
        System.out.println(instanceNew);
        System.out.println(instance == instanceNew);
    }
}
/**
 * 可以看到反射触发创建的SingletonHungry实例和单例模式拿到的实例不是一个，即破坏了单例模式。
 * 其实反射能用同样的方法破坏前面几节所有的单例模式实现，因为它们都是有私有构造器地
 * <p>
 * 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V3反射破坏单例模式及解决方案.E1破坏演示.SingletonHungry@677327b6
 * 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V3反射破坏单例模式及解决方案.E1破坏演示.SingletonHungry@14ae5a5
 * false
 */
