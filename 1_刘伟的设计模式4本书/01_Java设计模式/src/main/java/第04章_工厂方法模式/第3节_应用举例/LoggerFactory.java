/***********************************************************
 * @Description : 日志工厂
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 14:43
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第3节_应用举例;

/**
 * 抽象工厂方法，用于实现具体的子类工厂
 */
public interface LoggerFactory {
    Logger createLogger();
}
