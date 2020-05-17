/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 16:42
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第6题;

public class DbConverter implements Converter {
    public DbConverter() {
        System.out.println("创建了数据库的转换器！");
    }

    @Override
    public void convert() {
        System.out.println("转换数据库数据到Xml完成！");
    }
}
