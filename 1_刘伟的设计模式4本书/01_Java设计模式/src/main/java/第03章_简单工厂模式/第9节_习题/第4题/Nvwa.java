/***********************************************************
 * @Description : 女娲工厂类
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 10:44
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第9节_习题.第4题;

public class Nvwa {
    /**
     * 根据传入的人类名创建具体的人
     *
     * @param mankind 人种
     * @return 指定人种的实例
     */
    public static Person createPerson(String mankind) {
        switch (mankind) {
            case "男人":
                return new Man();
            case "女人":
                return new Woman();
            case "机器人":
                return new Robot();
        }
        return null;
    }
}
