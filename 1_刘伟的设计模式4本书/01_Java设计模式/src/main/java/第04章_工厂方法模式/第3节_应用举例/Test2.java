/***********************************************************
 * @Description : 利用反射获取类对象
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 15:11
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第3节_应用举例;

public class Test2 {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        // 可引入配置文件和反射机器获取
        factory = (LoggerFactory) XmlUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
/**
 * 创建文件日志记录器
 * 文件日志记录
 */
