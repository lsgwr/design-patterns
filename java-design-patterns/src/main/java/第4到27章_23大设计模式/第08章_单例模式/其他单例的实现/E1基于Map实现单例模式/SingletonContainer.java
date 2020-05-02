/***********************************************************
 * @Description : 基于Map容器实现的单例，缺点是线程不安全
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 19:28
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.其他单例的实现.E1基于Map实现单例模式;

import java.util.HashMap;
import java.util.Map;

public class SingletonContainer {
    private static Map<String, Object> singletonMap = new HashMap<>();

    private SingletonContainer() {
    }

    public static void putInstance(String key, Object instance) {
        if (key != null && instance != null) {
            if (!singletonMap.containsKey(key)) {
                // 实例仅第一次存进去
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
