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
public abstract class LoggerFactory {
    public void writeLog() {
        // 会调用到子类的实现
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();

    public abstract Logger createLogger(String args);

    public abstract Logger createLogger(Object obj);
}
