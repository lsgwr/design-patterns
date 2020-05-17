/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 16:42
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第9节_习题.第6题;

public class TxtConverter implements Converter {
    public TxtConverter() {
        System.out.println("创建了Txt的转换器！");
    }

    @Override
    public void convert() {
        System.out.println("转换Txt到Xml完成！");
    }
}
