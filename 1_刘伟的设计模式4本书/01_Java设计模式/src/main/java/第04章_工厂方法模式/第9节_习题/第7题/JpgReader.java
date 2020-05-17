/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 16:50
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第7题;

public class JpgReader implements ImageReader {
    public JpgReader() {
        System.out.println("创建jpg读取器！");
    }

    @Override
    public void read() {
        System.out.println("读取jpg图片完毕！");
    }
}
