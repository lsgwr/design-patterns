/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/19 23:30
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p07compositionaggregation;

public class ProductDao{

    private DbConnection dbConnection;

    public void setDbConnection(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
