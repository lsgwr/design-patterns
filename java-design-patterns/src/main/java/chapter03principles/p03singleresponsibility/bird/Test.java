/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2019/4/17 22:03
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter03principles.p03singleresponsibility.bird;

public class Test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
