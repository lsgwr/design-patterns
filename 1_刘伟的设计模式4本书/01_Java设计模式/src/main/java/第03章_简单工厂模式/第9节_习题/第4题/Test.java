/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 10:53
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第03章_简单工厂模式.第9节_习题.第4题;

public class Test {
    public static void main(String[] args) {
        Person person = Nvwa.createPerson("男人");
        person.say();

        person = Nvwa.createPerson("女人");
        person.say();

        person = Nvwa.createPerson("机器人");
        person.say();
    }
}
