/***********************************************************
 * @Description : 基于枚举实现地单例模式，这也是《Effective Java》中推荐的单例模式实现
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/2 17:04
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第08章_单例模式.饿汉式.V4基于枚举实现地最完美的单例模式;

public enum SingletonEnum {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }
}
