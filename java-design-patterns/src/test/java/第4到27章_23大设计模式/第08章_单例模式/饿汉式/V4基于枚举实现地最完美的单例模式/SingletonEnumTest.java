package 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V4基于枚举实现地最完美的单例模式;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonEnumTest {

    /**
     * 下面是测试用例的结果，可以看到枚举类能免疫序列化的破坏
     * <p>
     * java.lang.Object@5680a178
     * java.lang.Object@5680a178
     * true
     */
    @Test
    public void getInstance序列化破坏测试() throws IOException, ClassNotFoundException {
        SingletonEnum instance = SingletonEnum.getInstance();
        // 设置单例的对象
        instance.setData(new Object());
        // 1.序列化后写入到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file.txt"));
        oos.writeObject(instance);

        // 2.再从文件中取出来(反序列化)
        File file = new File("singleton_file.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SingletonEnum instanceNew = (SingletonEnum) ois.readObject();
        System.out.println(instance.getData());
        System.out.println(instanceNew.getData());
        System.out.println(instance.getData() == instanceNew.getData());
    }

    /**
     * ava.lang.NoSuchMethodException: 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V4基于枚举实现地最完美的单例模式.SingletonEnum.<init>()
     *
     * 	at java.lang.Class.getConstructor0(Class.java:3082)
     * 	at java.lang.Class.getDeclaredConstructor(Class.java:2178)
     * 	at 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V4基于枚举实现地最完美的单例模式.SingletonEnumTest.getInstance反射破坏测试
     * @throws NoSuchMethodException
     */
    @Test
    public void getInstance反射破坏测试() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objClass = SingletonEnum.class;
        // 当尝试修改枚举类的访问权限时会直接报错地,NoSuchMethodException，从而防止了反射攻击
        Constructor constructor = objClass.getDeclaredConstructor(String.class, Integer.class);
        constructor.setAccessible(true);
        SingletonEnum instanceNew = (SingletonEnum) constructor.newInstance("Geely", 666);
    }
}

