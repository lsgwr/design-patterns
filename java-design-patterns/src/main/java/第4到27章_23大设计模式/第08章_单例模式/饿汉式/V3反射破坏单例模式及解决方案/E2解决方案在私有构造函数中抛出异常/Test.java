/***********************************************************
 * @Description : 反射可以访问到私有构造器从而能拿到多个SingletonHungry地实例，因此破坏了单例模式
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 16:26
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V3反射破坏单例模式及解决方案.E2解决方案在私有构造函数中抛出异常;

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
 * 可以看到当尝试反射获取私有构造器时会抛出我们定义好的异常，有效地防止了反射攻击。懒汉式的几种单例实现都可以用此方法防止反射攻击(如果真想反射攻击地话，实际是挡不住地)
 * 能完美防御序列化和反射攻击的单例模式是基于枚举实现地，下一节会讲
 * <p>
 * at 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V3反射破坏单例模式及解决方案.E2解决方案在私有构造函数中抛出异常.Test.main(Test.java:20)
 * Caused by: java.lang.RuntimeException: 不允许反射访问私有构造方法
 * 	at 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V3反射破坏单例模式及解决方案.E2解决方案在私有构造函数中抛出异常.SingletonHungry.<init>(SingletonHungry.java:33)
 * 	... 5 more
 */
