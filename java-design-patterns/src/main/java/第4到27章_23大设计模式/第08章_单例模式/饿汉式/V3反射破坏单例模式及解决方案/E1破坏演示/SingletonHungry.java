/***********************************************************
 * @Description : 饿汉时的基本实现，在类加载地时候就完成单例的初始化了
 * 相比懒汉式虽然简单，但是存在浪费内存的风险
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 13:02
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V3反射破坏单例模式及解决方案.E1破坏演示;

public class SingletonHungry {
    /**
     * 类加载地时候就初始化，声明为final防止被二次赋值。static表明对所有实例有效，这也是单例模式的关键
     * <p>
     * 也可以用静态代码块也实现，都是在类加载地时候初始化，等效于下面的代码
     * <code>
     * private final static SingletonHungry singletonHungry;
     * static {
     *     singletonHungry = new SingletonHungry();
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
}
