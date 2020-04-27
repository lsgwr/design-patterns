/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/19 23:37
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S07_合成复用原则CompositionAggregation;

public class PostgreSqlConnection extends DbConnection {
    @Override
    public String getConnection() {
        return "PostgreSql数据库连接";
    }
}
