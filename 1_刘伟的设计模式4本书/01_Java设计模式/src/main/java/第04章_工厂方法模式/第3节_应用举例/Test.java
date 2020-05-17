/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 14:47
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第3节_应用举例;

public class Test {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        // 可引入配置文件和反射机器获取
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
/**
 * 创建文件日志记录器
 * 文件日志记录
 */
