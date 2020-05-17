/***********************************************************
 * @Description : 数据库日志工厂
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 14:44
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第3节_应用举例;

public class DatabaseLoggerFactory extends LoggerFactory{

    @Override
    public Logger createLogger() {
        // 使用默认方式连接数据库，代码省略
        // 创建数据库日志记录器
        Logger logger = new DatabaseLogger();
        // 初始化数据库日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        // 使用参数args作为连接字符串来连接数据库，代码省略
        // 创建数据库日志记录器
        Logger logger = new DatabaseLogger();
        // 初始化数据库日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        // 使用封装在obj中的连接字符串来连接数据库，代码省略
        // 创建数据库日志记录器
        Logger logger = new DatabaseLogger();
        // 初始化数据库日志记录器，代码省略
        return logger;
    }
}
