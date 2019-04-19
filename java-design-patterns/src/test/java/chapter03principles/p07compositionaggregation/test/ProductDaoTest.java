package chapter03principles.p07compositionaggregation.test;

import chapter03principles.p07compositionaggregation.MySqlConnection;
import chapter03principles.p07compositionaggregation.PostgreSqlConnection;
import chapter03principles.p07compositionaggregation.ProductDao;
import org.junit.Test;

/**
 * ProductDao Tester.
 *
 * @author liangshanguang
 * @date 04/19/2019
 * @description test
 */
public class ProductDaoTest {

    @Test
    public void testMain() {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySqlConnection());
        productDao.addProduct();
        productDao.setDbConnection(new PostgreSqlConnection());
        productDao.addProduct();
    }
} 
