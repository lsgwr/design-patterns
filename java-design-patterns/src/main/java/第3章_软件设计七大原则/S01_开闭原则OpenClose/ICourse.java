/***********************************************************
 * @Description : 课程接口
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/3/10 17:52
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第3章_软件设计七大原则.S01_开闭原则OpenClose;

public interface ICourse {
    /**
     * 获取课程id
     */
    Integer getId();

    /**
     * 获取课程名
     */
    String getName();

    /**
     * 获取课程价格
     */
    Double getPrice();
}
