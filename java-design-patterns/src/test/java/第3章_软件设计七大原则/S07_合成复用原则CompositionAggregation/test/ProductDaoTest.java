package 第3章_软件设计七大原则.S07_合成复用原则CompositionAggregation.test;

import 第3章_软件设计七大原则.S07_合成复用原则CompositionAggregation.MySqlConnection;
import 第3章_软件设计七大原则.S07_合成复用原则CompositionAggregation.PostgreSqlConnection;
import 第3章_软件设计七大原则.S07_合成复用原则CompositionAggregation.ProductDao;
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
