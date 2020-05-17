/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 16:45
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第6题;

public class TxtConverterFactory implements ConverterFactory {
    @Override
    public Converter createConverter() {
        return new TxtConverter();
    }
}
