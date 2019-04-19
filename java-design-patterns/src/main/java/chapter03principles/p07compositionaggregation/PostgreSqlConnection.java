/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/19 23:37
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p07compositionaggregation;

public class PostgreSqlConnection extends DbConnection {
    @Override
    public String getConnection() {
        return "PostgreSql数据库连接";
    }
}
