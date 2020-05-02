/***********************************************************
 * @Description : 序列化破坏单例模式
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 15:15
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V2序列化破坏单例模式及解决方案.E1序列化破坏单例模式;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonHungry singletonHungry = SingletonHungry.getInstance();
        // 1.序列化后写入到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file.data"));
        oos.writeObject(singletonHungry);

        // 2.再从文件中取出来(反序列化)
        File file = new File("singleton_file.data");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SingletonHungry singletonHungryNew = (SingletonHungry) ois.readObject();
        System.out.println(singletonHungry);
        System.out.println(singletonHungryNew);
        System.out.println(singletonHungry == singletonHungryNew);
    }
}
/**
 * 从下面可以看到反序列化从文件中读取地已经不是一个对象了
 * <p>
 * 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V2序列化破坏单例模式及解决方案.E1序列化破坏单例模式.SingletonHungry@42f30e0a
 * 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V2序列化破坏单例模式及解决方案.E1序列化破坏单例模式.SingletonHungry@3796751b
 * false
 */
